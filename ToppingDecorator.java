
public abstract class ToppingDecorator implements Pizza{
	//Local Pizza variable
	protected Pizza pizza;
	
	/**
	* Initializes Pizza variable
	* @param pizza, the new pizza obect
	*/
	public ToppingDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	/**
	 * returns type of pizza
	 */
	public String getType() {
		return pizza.getType();
	}
	
	/**
	 * Returns cost
	 */
	public int getCost() {
		return pizza.getCost();
	}
	
}
