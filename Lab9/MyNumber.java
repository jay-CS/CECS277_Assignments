
public class MyNumber {
	int number;
	
	public MyNumber() {
		this.number = 0;
	}
	
	public MyNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int num) {
		this.number = num;
	}
	
	public MyNumber add(MyNumber rhs) {
		this.number += rhs.number;
		return this;
	}
	
	public MyNumber div(MyNumber rhs) {
		if(rhs.number == 0) {
			throw new IllegalArgumentException("Error, connot dive by 0!");
		}
		this.number /= rhs.number;
		return this;
	}
	
	
	
}
