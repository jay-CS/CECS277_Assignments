package Visitor;

public class Phones implements Visitable{
	
	private int quantity;
	private double price;
	private String name;
	private double total = 0.0;
		
	public Phones(String name, int q, double cost ) {
		this.name = name;
		quantity = q;
		price = cost;
	}
		
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
		
	public double getTotal() {
		total = price*quantity;
		if(name.equalsIgnoreCase("Iphone X")) {
			return total - 30;
		}
		else if(name.equalsIgnoreCase("Samsung Galaxy 8")) { 
			return total * .80;
		}
		return total;
	}
	
	public String print() {
		return quantity + " "+ name + ": For " + getTotal();
	}
}
