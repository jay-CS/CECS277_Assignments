
public class Calculator {
	
	public static int add(int num_1, int num_2) {
		return num_1+num_2;
	}
	
	public static int sub(int num_1, int num_2) {
		return num_1-num_2;
	}
	
	public static int mult(int num_1, int num_2) {
		return num_1*num_2;
	}
	
	public static int divInt(int num_1, int num_2) {
		if(num_2 == 0) {
			throw new IllegalArgumentException("Cannot Divide by zero!");  
		}
		return num_1/num_2;
	}
	
	public static double divReal(int num_1, int num_2) {
		if(num_2 == 0) {
			throw new IllegalArgumentException("Cannot Divide by zero!");  
		}
		return (double) num_1/num_2;
	}	
	
}
