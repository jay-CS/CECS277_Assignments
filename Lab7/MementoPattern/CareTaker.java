package Memento;

import java.util.ArrayList;

public class CareTaker {
	
	private ArrayList<Memento> all = new ArrayList<Memento>();
	
	public void addMemento(Memento mem) {
		all.add(mem);
	}
	
	public Memento getPrev() {
		return all.get(all.size()-2);
	}

}
