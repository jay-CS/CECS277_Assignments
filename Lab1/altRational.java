import java.lang.Math;
public class altRational {
	/**
	 * The numerator
	 */
	int num;
	/**
	 * The denominator
	 */
	int den;
	
	/**
	 * Initializes the numerator and denominator to 0
	 */
	public altRational() {
		num = 0;
		den = 0;
		
	}
	
	/**
	 * Initializes the instance variables;
	 * @param numerator, becomes num
	 * @param denominator, becomes den
	 */
	public altRational(int numerator, int denominator) {
		num = numerator;
		den = denominator;
	}
	
	/**
	 * Returns the numerator
	 * @return num
	 */
	public int getNumerator() { return num; }
	
	/**
	 * Returns the denominator
	 * @return den
	 */
	public int getDenominator() { return den; }
	
	/**
	 * Sets the numerator to a new value
	 * @param val, the new numerator
	 */
	public void setNumerator(int val) {	num = val; }
	
	/**
	 * Sets the denominator to a new value
	 * @param val, the new denominator
	 */
	public void setDenominator(int val) { den = val; }
	
	/**
	 * Lets the user set the values of the numerator 
	 * and the denominator
	 */
	public void inputRational() {
		CheckInput chk = new CheckInput();
		num = chk.checkInt();
		den = chk.checkInt();
	}
	
	/**
	 * Overrides the string and prints out the two integers as
	 * a string
	 */
	@Override 
	public String toString() { 
		int gcd = gcd(num,den);
		while(gcd != 1) {
			num = num / gcd;
			den = den / gcd;
			gcd = gcd(num, den);
		}
		return num + "/" + den; 
	}
	
	/**
	 * Calculates the greatest common divisor
	 * @param m, first number
	 * @param n, second number
	 * @return m, returns the gcd of both numbers
	 */
	public int gcd(int m, int n) {
		int sub;
		while(n != 0) {
			sub = m % n;
			m = n;
			n = sub;
		}
		return m;
	}
	
	/**
	 * Adds the two rational numbers together
	 * @param r1, Rational Number 1
	 * @param r2, Rational Number 2
	 */
	public void add(altRational r1, altRational r2) {
		this.num= (r1.num * r2.den) + (r2.num * r1.den);
		this.den = r1.den * r2.den;
	}
	
	/**
	 * Subtracts the rational number from the number calling the method
	 * @param r, Rational Number
	 * @return, returns a Rational Object with the simplfied version of the 
	 * difference.
	 */
	public altRational subtract(altRational r) {
		int num = (this.num * r.den) - (r.num * this.den);
		int den = (this.den * r.den);
		return new altRational(num,den);
	}

	/**
	 * Multiples the two rational numbers
	 * @param r1, Rational Number 1
	 * @param r2, Rational NUmber 2
	 */
	public void mult(altRational r1, altRational r2) {
		this.num = r1.num * r2.num;
		this.den = r1.den * r2.den;

	}

	/**
	 * Divides the two rational numbers 
	 * @param r, is the rational number that will divide the rational calling
	 * the method
	 * @returns the simplified version of the two rational numbers
	 */
	public altRational div(altRational r) {
		int num = this.num * r.den;
		int den = this.den * r.num;
		return new altRational(num,den);
	}
	
	/**
	 * Divides the two rational numbers 
	 * @param r1 Rational Number 1
	 * @param r2 Rational NUmber 2
	 * @return, returns the real number after division
	 */
	public static double divToDouble(altRational r1, altRational r2) {
		double num = (((double) r1.num) / ((double) r1.den)) / (((double)(r2.num)) / ((double) r2.den));
		return num;
	}
	
}
