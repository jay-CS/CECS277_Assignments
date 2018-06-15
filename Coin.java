
public class Coin {
	//name of the string
	private String name;
	//Value of coin
	private double value;
	
	/**
	 * Initializes instance variables
	 */
	public Coin() {
		name = " ";
		value = 0.0;
	}
	
	/**
	 * Sets instance variables
	 * @param name, name of the coin
	 * @param val, value of the coin 
	 */
	public Coin(String name, double val) {
		this.name = name;
		value = val;
	}
	
	/**
	 * Gets the value of the coin 
	 * @return value, the value of the coin
	 */
	public double getVal() {
		return value;
	}
	/**
	 * Returns the coin and value as a string
	 */
	public String toString() {
		return name + " @ " + value;
	}
	
}
