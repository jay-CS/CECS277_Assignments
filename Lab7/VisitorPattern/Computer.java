package Visitor;

public class Computer implements Visitable{
	
	private int quantity;
	private double price;
	private String name;
	private double total = 0.0;
		
	public Computer(String name, int q, double cost ) {
		this.name = name;
		quantity = q;
		price = cost;
	}
		
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
		
	public double getTotal() {
		total = price*quantity;
		if(name.equalsIgnoreCase("Microsoft Surface Tablet")) {
			return total * .80;
		}
		return total;
	}
	
	public String print() {
		return quantity + " "+ name + ": For " + getTotal();
	}
}
