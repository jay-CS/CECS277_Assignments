
public class Pineapple extends ToppingDecorator {
	//Local Pizza object
	Pizza pizza;
	
	/**
	 * Initializes Pizza variable
	 * @param pizza, the new pizza obect
	 */
	public Pineapple(Pizza pizza) {
		super(pizza);
	}
	
	/**
	 * Returns type of Pizza
	 */
	public String getType() {
		return super.getType() + "Pineapple, ";
	}
	
	/**
	 * Returns cost
	 */
	public int getCost() {
		return 2 + super.getCost();
	}
}
