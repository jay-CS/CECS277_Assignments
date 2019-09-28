package Command;

public class CommandTester {
		  
	public static void main(String[] args) {
		      
		Stock APPL = new Stock("APPLE", 100);
		Stock NFLX = new Stock("NETFLIX", 200);
		Stock GOL = new Stock("GOLINEAS AIRLINES", 11);
		Orders orders = new Orders();     
		       
		//Buying Orders   
		Choice c1 = new BuyStock(APPL, 15);
		Choice c2 = new BuyStock(NFLX, 12);
		Choice c3 = new BuyStock(GOL, 5);
		      
		//Selling Orders 
		Choice c4 = new SellStock(APPL, 2);
		Choice c5 = new SellStock(NFLX, 3);
		Choice c6 = new SellStock(GOL, 4);

	    orders.addOrder(c1);
	    orders.addOrder(c2);
	    orders.addOrder(c3);
	    orders.addOrder(c4);
	    orders.addOrder(c5);
	    orders.addOrder(c6);
	    orders.exe();
	    
	}

}
