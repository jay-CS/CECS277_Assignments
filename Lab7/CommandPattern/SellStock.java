package Command;

public class SellStock implements Choice{
	// class for selling stock

	  
	private Stock stock;
	private int quantity;
				  
			
	public SellStock(Stock stock, int quantity) {
		this.stock = stock;
		this.quantity = quantity;
	}

	@Override
	public void execute() {
		stock.sell(quantity);
	}

}
