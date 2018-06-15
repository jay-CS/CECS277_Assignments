
public class MonetaryUnit {
	/*
	 * The value of the currency 
	 */
	private double value;
	/*
	 * The type of currency 
	 */
	private String bill;
	
	/**
	 * Initializes the value and the type of bill
	 * @param amt, is the bill's worth
	 * @param name, is the type of bill
	 */
	public MonetaryUnit(double amt, String name) {
		value = amt;
		bill = name;
	}
	
	/**
	 * Returns the value of bill
	 * @return value
	 */
	public double getValue() {
		return value;
	}
	
	/**
	 * Returns the type of bill/currency used
	 * @return bill
	 */
	public String getBill() {
		return bill;
	}
}
