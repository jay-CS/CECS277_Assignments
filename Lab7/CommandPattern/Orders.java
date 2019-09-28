package Command;

import java.util.ArrayList;

public class Orders {
	
	ArrayList<Choice> orders = new ArrayList<Choice>();
	
	public void addOrder(Choice order) {
		orders.add(order);
	}
	
	public void exe() {
		for(Choice choice : orders) {
			choice.execute();
		}
	}
}
