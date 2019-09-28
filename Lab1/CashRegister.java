
public class CashRegister {
	/*
	 * Is the payment the user will make
	 */
	private double payment = 0.0;
	
	/*
	 * The amount owed for the product
	 */
	private double balance;
	
	/**
	 * Initializes the value of balance with the amount owed for the product
	 * @param val, is the value of the bill 
	 */
	public void recordPurchase(double val) { balance = val; }
	
	/**
	 * Returns the amount of change left to the user, unless the user did not 
	 * enter enough to voer the balance, otherwise their entire payment is returned
	 * @return the amount of change
	 */
	public double giveChange() { 
		if(payment < balance) {
			System.out.printf("%.2f is not enough to purchase the item", payment);
			System.out.println("\nHere is your change!");
			double temp = payment;
			payment = 0.0;
			return temp;
		}
		return (payment - balance); 
	}
	
	/**
	 * Accumulates the amount of payments the user has entered
	 * @param quantity, is the amount of the single currency the method receives
	 * @param mn, is the Object that will be able to access the currency's type and worth
	 */
	public void enterPayment(double quantity, MonetaryUnit mn) {
		payment += mn.getValue()*quantity;
	}
}

