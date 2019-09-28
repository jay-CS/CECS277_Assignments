package Visitor;

import java.util.ArrayList;

public class ShoppingCart {
	
	ArrayList<Visitable> items = new ArrayList<Visitable>();
	
	public double getCost() {
		ItemVisitor iv = new ItemVisitor();
		for(Visitable v: items) {
			v.accept(iv);
		}
		return iv.getTotal();
	}
	
	public void getItems() {
		ItemVisitor iv = new ItemVisitor();
		for(Visitable item: items) {
			item.accept(iv);
		}

		System.out.println(iv.getList());
	}
	
}
