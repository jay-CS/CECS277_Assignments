
public class Part_Time extends Staff {
	//Hours worked per week by part-time employees
	private double hours_worked;
	
	/**
	 * Initializes values for hours worked;
	 */
	public Part_Time() {
		super();
		hours_worked = 0.0;
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
	 * @param hourly, hourly rate paid
	 * @param worked, the amount of hours worked in a given week
	 */
	public Part_Time(String fname, String lname, String gender, String ID, int year, int month, int day, double hourly, double worked) {
		super(lname,fname,ID,gender,year,month,day,hourly);
		hours_worked = worked;
	}
	
	/**
	 * sets the hours_worked
	 * @param num, the number of hours worked
	 */
	public void sethoursWorked(double num) {
		hours_worked = num;
	}
	
	/**
	 * @return, the hours worked
	 */
	public double gethoursWorked() {
		return hours_worked;
	}
	
	/**
	 * Returns the employee information and hours worked in a week 
	 */
	public String toString() {
		return String.format(super.toString() + "\nHours worked per week: %.2f",gethoursWorked());
	}
	
	/**
	 * Returns the monthly earning for employee
	 */
	public double monthlyEarnings() {
		return hours_worked * getHourly()*4;
	}
	
}
