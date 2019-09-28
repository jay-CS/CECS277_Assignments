package Visitor;

public class Consoles implements Visitable {
	
	private int quantity;
	private double price;
	private String name;
	
		
	public Consoles(String name, int q, double cost ) {
		this.name = name;
		quantity = q;
		price = cost;
	}
		
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
		
	public double getTotal() {
		if(name.equalsIgnoreCase("PS4")) {
			return price  * quantity * .80;
		}
		else if(name.equalsIgnoreCase("Xbox One")) {
			if(quantity >= 2) {
				return price * quantity * .70;
			}
			return price * quantity;
		}
		return price * quantity;
	}
	
	public String print() {
		return quantity + " "+ name + ": For " + getTotal();
	}
}
