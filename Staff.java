
public class Staff extends Employee {
	//Hourly rate for employee
	private double hourly_rate;
	
	/**
	 * Initializes instance variables to default values
	 */
	public Staff() {
		super();
		hourly_rate = 0.00;
	}
	/**
	 * Creates a specified employee
	 * @param fname, the first name of employee
	 * @param lname, the last name of the employee
	 * @param gender, the gender of the employee
	 * @param ID, the employees ID number
	 * @param year, the birth year
	 * @param month, the birth month
	 * @param day, the birth day
	 * @param hourly
	 */
	public Staff(String fname, String lname, String gender, String ID, int year, int month, int day, double hourly) {
		super(lname,fname,ID,gender,year,month,day);
		hourly_rate = hourly;
	}
	
	/**
	 * Returns the user information and there hourly rate
	 */
	public String toString() {
		return String.format(super.toString() + "\nGender: " + super.gender + "\nFull-Time\nHourly Rate: $%.2f", getHourly());
	}
	
	/**
	 * returns hourly rate
	 * @return hourly rate
	 */
	public double getHourly() {
		return hourly_rate;
	}
	
	/**
	 * Sets the hourly rate
	 * @param num, new hourly rate
	 */
	public void setHourly(double num) {
		hourly_rate = num;
	}
	
	/**
	 * Returns the monthly earning for the employee
	 */
	public double monthlyEarnings() {
		return hourly_rate * STAFF_MONTHLY_HOURS_WORKED;
	}
	
}
