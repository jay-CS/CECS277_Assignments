import java.util.Scanner;

public class Pizzatester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean cont = true;
		Pizza pizza = new NewPizza();
		while(cont) {
			System.out.println("~~~~~Enter toppings for your pizza~~~~~~");
			System.out.println("1) Pepperoni ");
			System.out.println("2) Pineapple ");
			System.out.println("3) Sausage ");
			System.out.println("Press X to exit");
			String choice = in.nextLine();
			switch(choice) {
				case "1":
					pizza = new Pepperoni(pizza);
					break;
				case "2":
					pizza = new Pineapple(pizza);
					break;
					
				case "3":
					pizza = new Sausage(pizza);
					break;
				
				case "X":
					cont = false;
					break;
				
				case "x":
					cont = false;
					break;			
			}
		}
		System.out.println("You ordered a " + pizza.getType() + " pizza");
		System.out.println("The total is: $" + pizza.getCost());
	}
}
