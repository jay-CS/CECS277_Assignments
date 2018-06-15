
public class Sausage extends ToppingDecorator {
	
	//Local Pizza object
	Pizza pizza;
		
	/**
	* Initializes Pizza variable
	* @param pizza, the new pizza obect
	*/
	public Sausage(Pizza pizza) {
		super(pizza);
	}
	/**
	 * Returns type of Pizza
	 */
	public String getType() {
		return super.getType() + "Sausage, ";
	}
	/**
	 * Returns cost
	 */
	public int getCost() {
		return 1 + super.getCost();
	}
}
