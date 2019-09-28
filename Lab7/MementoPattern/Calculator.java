package Memento;

public class Calculator {
	
	private double int1;
	private double int2;
	private double total;
	
	
	public void setState(double i1, double i2) {
			int1 = i1;
			int2 = i2;
			total = int1 + int2;
	}
	
	public Memento savetoMemento() {
		return new Memento(int1, int2);
	}
	
	public String getState() {
		return int1 + " + " + int2 + " =  " + total;
	}
	
	public void getStatefromMemento(Memento memento) {
		int1 = memento.num1;
		int2 = memento.num2;
		total = memento.total;
	}
}

