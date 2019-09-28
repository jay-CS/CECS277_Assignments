import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class debitTester {
	private BankAccount bk1;
	
	@Before
	public void setUp() throws Exception{
		bk1 = new BankAccount("Jay Bazan",100);
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("TORE IT THE ***** DOWN!!!:)");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeDebit() throws Exception {
		bk1.setDebit(50);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testOverdraft() throws Exception {
		bk1.setDebit(200);
	}
	
	@Test
	public void testwithAssert() {
		assertFalse(bk1.equals(new BankAccount("Jay Bazan",150)));
	}
	
	
	@Test
	public void testCorrectDebit() throws Exception {
		bk1.setDebit(50);
		assertEquals("Error in Debit!",150,bk1.getBalance(),.00001);
	}

}
