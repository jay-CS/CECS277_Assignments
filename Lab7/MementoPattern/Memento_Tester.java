package Memento;

import java.util.Scanner;

public class Memento_Tester {
	
	public static void main(String[] args) {
		double num1;
		double num2;
		Calculator calc = new Calculator();
		CareTaker care = new CareTaker();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		num1 = in.nextDouble();
		System.out.println("Enter 2nd Number: ");
		num2 = in.nextDouble();
		calc.setState(num1, num2);
		care.addMemento(calc.savetoMemento());
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Enter 1st Number: ");
		num1 = in.nextDouble();
		System.out.println("Enter 2nd Number: ");
		num2 = in.nextDouble();
		calc.setState(num1, num2);
		care.addMemento(calc.savetoMemento());
		System.out.println("Current Calculation: " + calc.getState());
		calc.getStatefromMemento(care.getPrev());
		System.out.println("Previous Calculation: " + calc.getState());
		in.close();
	}	
	
	
}
