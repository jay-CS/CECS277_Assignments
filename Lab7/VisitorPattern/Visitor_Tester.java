package Visitor;

import java.util.Scanner;

public class Visitor_Tester {
	
	public static void main(String[] args) {
		int quantity = 0;
		ShoppingCart cart = new ShoppingCart();
		Scanner in = new Scanner(System.in);
		boolean cont = true;
		while(cont) {
			menu();
			int selection = in.nextInt();
			in.nextLine();
			switch(selection) {
				
				case 1:	System.out.println("How many would you like?");
						
						quantity = in.nextInt();
						Phones p = new Phones("Iphone X", quantity, 400.00);
						cart.items.add(p);
						break;
				
				case 2: System.out.println("How many would you like?");
						quantity = in.nextInt();
						Phones p2 = new Phones("Samsung Galaxy 8", quantity, 600.00);
						cart.items.add(p2);
						break;
				
				case 3: System.out.println("How many would you like?");
						quantity = in.nextInt();
						Computer cp = new Computer("Microsoft Surface tablet", quantity, 800.00);
						cart.items.add(cp);
						break;
				
				case 4:System.out.println("How many would you like?");
						quantity = in.nextInt();
						Computer cp1 = new Computer("Alienware", quantity, 1000.00);
						cart.items.add(cp1);
						break;
				
				case 5:System.out.println("How many would you like?");
						quantity = in.nextInt();
						Consoles con = new Consoles("PS4", quantity, 400.00);
						cart.items.add(con);
						break;
				
				case 6:System.out.println("How many would you like?");
						quantity = in.nextInt();
						Consoles con1 = new Consoles("XBOX ONE", quantity, 450.00);
						cart.items.add(con1);
						break;
				
				case 7:
					cont = false;
					break;
			}
		}
		cart.getItems();
		System.out.println("Total was: $" + cart.getCost());
		in.close();
	}
	
	public static void menu() {
		System.out.println("1). Iphone X: $400 with $30 discount");
		System.out.println("2). Samsung Galaxy: $600 with 20% discount ");
		System.out.println("3). Microsoft Surface Tablet: $800 with 20% disocunt ");
		System.out.println("4). AlienWare: $1000");
		System.out.println("5). PS4: $400 with 20% discount ");
		System.out.println("6). XBOX ONE: $450, buy two get 30% off");
		System.out.println("7). Exit");
	}
}
