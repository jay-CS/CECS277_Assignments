import java.util.Calendar;
import java.util.GregorianCalendar;


public abstract class Employee implements EmployeeInfo, Comparable<Employee>{
	String lname;
	String fname;
	String ID;
	String gender;
	GregorianCalendar birthday = new GregorianCalendar();
	
	/**
	 * Initializes instance variables to default values 
	 */
	public Employee() {
		lname = " ";
		fname = " ";
		ID = " ";
		gender = " ";
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
	 */
	public Employee(String last, String first, String id, String sex, int year, int month, int day) {
		lname = last;
		fname = first;
		ID = id;
		gender = sex;
		birthday.set(year, month, day);
	}
	
	/**
	 * Returns the instance variables in a string format
	 */
	public String toString() {	
		return  "Last Name: " + lname + "\nFirst Name: " + fname + "\nEmployee ID: " 
				+ ID + "\nBirthday: " + birthday.get(Calendar.MONTH) + "/" + 
				birthday.get(Calendar.DAY_OF_MONTH) +"/" + birthday.get(Calendar.YEAR);
	}
	
	/**
	 * returns the last name
	 * @return lname
	 */
	public String getlname() { return lname; }
	
	/**
	 * returns first name
	 * @return fname
	 */
	public String getfname() { return fname; }
	
	/**
	 * returns Employee's ID number
	 * @return ID
	 */
	public String getID() { return ID; }
	
	/**
	 * Returns gender
	 * @return gender
	 */
	public String getGender() { return gender; }
	
	/**
	 * Sets the last name
	 * @param name, new last name
	 */
	public void setlname(String name) {
		lname = name;
	}
	
	/**
	 * Sets the first name
	 * @param name, new first name
	 */
	public void setfname(String name) { 
		fname = name; 
	}
	
	
	/**
	 * Sets the ID number
	 * @param id, new ID number
	 */
	public void setID(String id) { 
		ID = id;
	}
	
	/**
	 * sets the Gender
	 * @param gen, the gender
	 */
	public void setGender(String gen) { 
		gender = gen;
	}
	
	/**
	 * Computes the monthly earnings
	 */
	public abstract double monthlyEarnings();
	
	/**
	 * Compares objects of Employee
	 */
	public int compareTo(Employee e){

		return(e.lname.compareTo(this.lname));
	}

}
