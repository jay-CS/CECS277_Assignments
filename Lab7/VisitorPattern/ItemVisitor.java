package Visitor;

public class ItemVisitor implements Visitor {
	
	private double total = 0.0;
	private String all_items = "";
	
	public void visit(Computer comp) {
		total += comp.getTotal();
		all_items += "\n" + comp.print();
	}
	
	public void visit(Phones phone) {
		total += phone.getTotal();
		all_items += "\n" + phone.print();
	}
	
	public void visit(Consoles console) {
		total += console.getTotal();
		all_items += "\n" + console.print();
	}
	
	public double getTotal(){
		return total;
	}
	
	public String getList() {
		return all_items;
	}
	
}
