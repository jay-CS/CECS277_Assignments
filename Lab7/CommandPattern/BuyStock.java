package Command;


	public class BuyStock implements Choice{
	// class for buying stocks  
		private Stock stock;
		private int quantity;
			  
		public BuyStock(Stock stock, int quantity) {
			this.stock = stock;
			this.quantity = quantity;
		}

		@Override
		public void execute() {
			stock.buy(quantity);
		}

	}
