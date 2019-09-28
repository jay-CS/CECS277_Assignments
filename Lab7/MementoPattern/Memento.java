package Memento;

public class Memento {
	
	double num1;
	double num2;
	double total;
	
	
	public Memento(double n1, double n2) {
		num1 = n1;
		num2 = n2;
		total = num1 + num2;
	}
	
	public String getState() {
		return num1 + " + " + num2 + " = " + total;
	}
	

}
