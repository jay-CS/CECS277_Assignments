import java.util.ArrayList;

public class CoinSet {
	//Is the amount of coins entered
	private ArrayList<Coin> set;
	
	public CoinSet() {
		set = new ArrayList<Coin>();
	}
	/**
	 * Sets the coin to the amount entered
	 * @param set, is the coins entered
	 */
	public CoinSet(ArrayList<Coin> set) {
		this.set = set;
	}
	
	/**
	 * Adds a coin to the list
	 * @param coin, is the coin entered
	 */
	public void addCoin(Coin coin) {
		set.add(coin);
	}
	
	/**
	 * Gets the value of the amount entered
	 * @return val, the value of the coins entered
	 */
	public double getValue() {
		double val = 0.0;
		for(int i = 0; i < set.size(); i++) {
			val += set.get(i).getVal();
		}
		return val;
	}
	
	/**
	 * 
	 * @param coins
	 */
	public void addCoins(ArrayList<Coin> coins) {
		set.addAll(coins);
	}
	
	/**
	 * Removes all the coins entered
	 */
	public void removeAll() {
		set.clear();
	}
	
	/**
	 * Returns the value of the coins entered
	 */
	public String toString() {
		return "Value: " + getValue();
	}
	
	
}
