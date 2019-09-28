import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyNumberTest {
	private MyNumber num1,num2;
	
	@Before
	public void setUp() throws Exception{
		System.out.print("Run @ Before");
		num1 = new MyNumber(11);
		num2 = new MyNumber(22);
	}
	
	@After
	public void tearDown() throws Exception {
		System.out.println("Run @After");	
	}
	
	@Test
	public void testGetterSetter() {
		System.out.println("Run @Test testGetterSetter");
		int value = 33;
		num1.setNumber(value);
		assertEquals("Error in getter/setter",value,num1.getNumber());
	}
	
	@Test
	public void testAdd() {
		System.out.println("Run @Test testAdd");
		assertEquals("Error in add",33,num1.add(num2).getNumber());
		assertEquals("Error in add",55,num1.add(num2).getNumber());
		
	}
	
	@Test
	public void testDiv() {
		System.out.println("Run @Test testDiv");
		assertEquals("Error in div",2,num2.div(num1).getNumber());
		assertEquals("Error in div",0,num2.div(num1).getNumber());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDivByZero() {
		System.out.println("Run @Test testDivByZero");
		num2.setNumber(0);
		num1.div(num2);
	}
	
}
