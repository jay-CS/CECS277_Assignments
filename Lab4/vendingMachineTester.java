import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Jonathan Bazan
 *
 */
public class vendingMachineTester {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Products> p = new ArrayList<Products>();
		Vending_Machine vn = new Vending_Machine(p);
		boolean cont = true;
		
		while(cont != false) {
			display();
			int choice = in.nextInt();
			switch(choice) {
				case 1: 
					vn.showProducts();
					System.out.println();
					break;
				
				case 2: 
					coinDisplay();
					in.nextLine();
					String selection = in.nextLine();
					double coinVal = getUserVal(selection.toUpperCase());
					String billname = getBillName(coinVal);
					vn.addCoin(new Coin(billname, coinVal));
					break;
					
				case 3:
					if(vn.products.size() > 0) {
						vn.showProducts();
						in.nextLine();
						String product_choice = in.nextLine();
						double entered = vn.currentCoin.getValue();
						double balance = vn.getProductVal(product_choice.toLowerCase());
						Products prod = vn.products.get(vn.getProductIndex(product_choice));
						if(entered >= balance) {
							entered = entered - balance;
							System.out.println("Purchased: " + prod.toString());
							prod.removeItem();
						}
						else {
							System.out.println("Insufficient Money");
						}
						vn.currentCoin.removeAll();
					}
					break;
					
				case 4: 
					System.out.println("Description: ");
					in.nextLine();
					String desc = in.nextLine();
					System.out.println("Price: ");
					double price = in.nextDouble();
					System.out.println("Quantity: ");
					int q = in.nextInt();
					vn.addProduct(desc, price, q);
					break;
					
				case 5: 
					double val = vn.coin.getValue();
					vn.coin.removeAll();
					System.out.println("Removed: $" + val);
					break;
					
				case 6: 
					cont = false;
					break;
			}
		}
	}
	
	/**
	 * Displays all the menu options to the user
	 */
	public static void display() {
		System.out.println("1) Show Products");
		System.out.println("2) Insert Coin");
		System.out.println("3) Buy Product");
		System.out.println("4) Add Product");
		System.out.println("5) Remove Coins");
		System.out.println("6) Quit");
		
	}
	
	/**
	 * Displays the different amounts of money the user can enter
	 */
	public static void coinDisplay() {
		System.out.println("A) Nickel @ 0.05");
		System.out.println("B) Dime @ 0.10");
		System.out.println("C) Quarter @ 0.25");
		System.out.println("D) Dollar @ 1.00");
	}
	
	/**
	 * Computes the money the user wants to input
	 * @param let, is the letter the user enters from the coin menu
	 * @returns the value of the option chosen
	 */
	public static double getUserVal(String let) {
		if(let.equals("A")) {
			return .05;
		}
		else if(let.equals("B")) {
			return .10;
		}
		else if(let.equals("C")) {
			return .25;
		}
		else if(let.equals("D")){
			return 1.0;
		}
		else {
			return 0;
		}
	}

	/**
	 * Computes the name of the bill
	 * @param val, is the value of the bill
	 * @return the name of the bill
	 */
	public static String getBillName(double val) {
		if(val == .05) {
			return "NICKEL";
		}
		else if(val == .10) {
			return "DIME";
		}
		else if(val == .25) {
			return "QUARTER";
		}
		else if(val == 1.0){
			return "DOLLAR";
		}
		else {
			return "";
		}
	}
}

