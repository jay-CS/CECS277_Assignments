import static org.junit.Assert.*;

import org.junit.Test;

public class AddSubTest {

	@Test
	public void testPass() {
		
		assertEquals("error in add",3,Calculator.add(1, 2));
		assertEquals("error in add",-3,Calculator.add(-1, -2));
		assertEquals("error in add",9,Calculator.add(9, 0));
	}
	
	@Test
	public void testAddFail() {
		assertNotEquals("error in add",0,Calculator.add(1, 2));
	}
	
	@Test
	public void testSubPass() {
		assertNotEquals("error in sub",3,Calculator.add(2, 1));
		assertNotEquals("error in sub",9,Calculator.add(-2, -1));
		assertNotEquals("error in sub",9,Calculator.add(2, 2));
	}

	@Test
	public void tessubFail() {
		assertNotEquals("error in sub",9,Calculator.add(2, 1));
	}
}
