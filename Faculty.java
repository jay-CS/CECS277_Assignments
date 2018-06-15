
public class Faculty extends Employee implements Cloneable {
	//Employees job level
	private String level;
	//Employees Education 
	private Education edu;
	
	//Creates a default faculty member
	public Faculty() {
		super();
		level = " ";
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
	 * @param lev, the level of the employee
	 * @param edu, the employees education 
	 */
	public Faculty(String fname, String lname, String gender, String ID, int year, int month, int day, String lev, Education edu ) {
		super(lname,fname,ID,gender, year,month,day);
		level = lev;
		this.edu = edu;
	}
	
	/**
	 * Sets the employee information
	 * @param edu, is the employees education 
	 */
	public void setEducation(Education edu) {
		this.edu = edu;
	}
	
	/**
	 * Prints out the employees information and education 
	 */
	public String toString() {
		return  super.toString() + "\nLevel: " + getTitle(level) + edu.toString();
	}
	
	/**
	 * @return the level of the method 
	 */
	public String getLevel() {
		return level;
	}
	
	/**
	 * Retrieves the position of the faulty member
	 * @param title, position of the faculty member
	 * @return the String position 
	 */
	public String getTitle(String title) {
		if(level == "AS") {
			return "Assistant";
		}
		else if(level == "AO") {
			return "Associate";
		}
		else {
			return "Full-Time";
		}
	}
	
	/**
	 * Sets the job level for the employee
	 * @param lev, is the level of the employee
	 */
	public void setLevel(String lev) {
		level = lev;
	}
	
	/**
	 * Computes the monthly salary for the faculty member
	 */
	public double monthlyEarnings() {
		if(level == "AS") {
			return FACULTY_MONTH_SALARY;
		}
		else if(level == "AO") {
			return FACULTY_MONTH_SALARY*1.5;
		}
		else {
			return FACULTY_MONTH_SALARY*2;
		}
	}
	
	/**
	 * Creates a clone of the object education 
	 */
	public Object clone() throws CloneNotSupportedException {
		//Super.clone () return object thats why we need a cast
		Faculty bb = (Faculty) super.clone();
		edu = (Education) edu.clone();
		bb.setEducation(edu);
		return bb;
	}
}
