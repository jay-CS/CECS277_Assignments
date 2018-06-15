
public class Products {
	//Name of the product
	String name;
	//Value of the product
	double value;
	
	int quantity;
	/**
	 * Initializes the instance variables
	 */
	public Products() {
		name = " ";
		value = 0.0;
		quantity = 0;
	}
	
	/**
	 * Sets the instance variables
	 * @param str, name of the product
	 * @param val, price of the product
	 */
	public Products(String str, double val, int q) {
		name = str;
		value = val;
		quantity = q;
	}
	
	/**
	 * Returns the value of the product
	 * @return val, the value of the product
	 */
	public double getVal() {
		return value;
	}
	
	/**
	 * Sets the quantity of the product 
	 * @param q, the quantity
	 */
	public void setQuantity(int q) {
		quantity = q;
	}
	
	
	public void removeItem() {
		quantity -= 1;
		
	}
	/**
	 * Checks to see if two products are equal 
	 * @param p, is the product
	 * @return true if they are the same, otherwise false
	 */
	boolean equals(Products p) {
		if(p == null) {
			return false;
		}
		else if(this.name.equals(p)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Returns the name, value, and quantity of the product
	 */
	public String toString() {
		return name + " @ " + value ;
	}
	
	
}
