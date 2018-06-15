import java.util.ArrayList;

public class Vending_Machine { 
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	//The list of products
	ArrayList<Products> products;
	//The current coin
	CoinSet currentCoin;
	//The list of coins entered
	CoinSet coin;
	
	/**
	 * Initializes the products of the vending machine
	 * @param p, the list of products
	 */
	public Vending_Machine(ArrayList<Products> p) {
		products = p;
		currentCoin = new CoinSet();
		coin = new CoinSet();
	}
	
	/**
	 * Adds another product to the vending machine
	 * @param name, name of the product
	 * @param val, value of the product
	 * @param q, quantity
	 */
	public void addProduct(String name, double val, int q) {
		products.add(new Products(name, val, q));
	}
	
	/**
	 * Adds a coin to the product
	 * @param c, the coin being entered
	 */
	public void addCoin(Coin c) {
		currentCoin.addCoin(c);
		coin.addCoin(c);
	}
	
	/**
	 * Returns the value of the products
	 * @param choice, is the user's choice 
	 * @return value, is the value of the product
	 */
	public double getProductVal(String choice) {
		double value = 0.0;
		for(int i = 0; i < alphabet.length(); i++) {
			if(choice.equals(alphabet.substring(i,i+1))) {
				value = products.get(i).value;
			}
		}
		return value;
	}
	

	/**
	 * Computes the index of the users selection in the menu
	 * @return x, the index of the choice
	 */
	public int getProductIndex(String choice) {
		String name = "";
		int x = 0;
		if(products.size() > 0) {
			while(x < alphabet.length()) {
				if(choice.equals(alphabet.substring(x,x+1))) {
					name = products.get(x).name;
					break;
				}
				x++;	
			}
		}
		return x;
	}
	/**
	 * Displays all the products in the vending machine
	 */
	public void showProducts() {
			for(int i = 0; i < products.size(); i++) {
				if(products.get(i).quantity > 0) {
					System.out.println(alphabet.substring(i, i+1).toUpperCase() + ") " +  products.get(i).toString());
				}
				else {
					products.remove(i);
				}
			}
		}
	}
	
