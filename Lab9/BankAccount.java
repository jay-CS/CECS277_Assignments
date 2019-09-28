import java.util.*;
public class BankAccount {
	private String customername;
	private double balance;
	private boolean frozen = false;
	
	private BankAccount() {}
	
	public BankAccount(String name, double bal) {
		customername = name;
		balance = bal;
	}
	
	public String getCusotmerName(String name, double balance) {
		return customername;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setDebit(double amount) throws Exception { 
		if (frozen) { 
			throw new IllegalArgumentException("Cannot divide by 0!"); 
		}

		if (amount > balance) { 
			throw new IllegalArgumentException("amount"); 
		}
		
		if (amount < 0) { 
			throw new IllegalArgumentException("amount"); 
		}
		balance += amount; // intentionally incorrect code 
	}
	
	public void setCredit(double amount) throws Exception { 
		if (frozen) { 
			throw new Exception("Account frozen"); 
		}
		if (amount < 0) { 
			throw new Exception("amount"); 
		}
		balance += amount; 
	}

	private void FreezeAccount() { 
		frozen = true; 
	}

	private void UnfreezeAccount() { 
		frozen = false; 
	} 
	
}
