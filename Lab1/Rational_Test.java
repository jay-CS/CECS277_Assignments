
public class Rational_Test {
	public static void main(String[] args) {
		
		CheckInput chk = new CheckInput();
		System.out.println("Please enter two numbers \nNumerator: ");
		int val1 = chk.checkInt();
		System.out.println("Denominator");
		int val2 = chk.checkInt();
		altRational r1 = new altRational(val1, val2);
		System.out.println("Please enter two numbers \nNumerator: ");
		int val3 = chk.checkInt();
		System.out.println("Denominator");
		int val4 = chk.checkInt();
		altRational r2 = new altRational(val3, val4);
		altRational r3 = new altRational();
		r3.add(r1, r2);
		System.out.println(r1.toString() + " + " + r2.toString() + " = " + r3.toString());
		r3 = r1.subtract(r2);
		System.out.println(r1.toString() + " - " + r2.toString() + " = " + r3.toString());
		r3.mult(r1, r2);
		System.out.println(r1.toString() + " * " + r2.toString() + " = " + r3.toString());
		r3 = r1.div(r2);
		System.out.println(r1.toString() + " / " + r2.toString() + " = " + r3.toString());
		System.out.println(r1.toString() + " / " + r2.toString() + " = " + r3.divToDouble(r1, r2));
		r1.setNumerator(2);
		r2.setDenominator(5);
		System.out.println("Numerator: " + r1.getNumerator());
		System.out.println("Denominator: " + r2.getDenominator());
		
		}
	}

