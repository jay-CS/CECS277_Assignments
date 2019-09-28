import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PartTime implements Employees, Comparable<Employees>, Serializable {
	//Hours worked per week by part-time employees
	    
		double hours_worked;
		double hourly_rate;
		String insurance;
		String lname;
		String fname;
		String ID;
		String gender;
		String level;
		Education edu;
		GregorianCalendar birthday = new GregorianCalendar();
		
		
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
		public PartTime(String fname, String lname, String gender, String ID, int year, int month, int day, double hourly ,double worked) {
			this.lname = lname;
			this.fname = fname;
			this.ID = ID;
			this.gender = gender;
			birthday.set(year, month, day);
			hours_worked = worked;
			hourly_rate = hourly;
			insurance = "OFF";
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
		 * Returns the monthly earning for employee
		 */
		public double monthlyEarnings() {
			return hours_worked * hourly_rate * 4;
		}
		
		/**
		 * Returns the instance variables in a string format
		 */
		public String toString() {	
			return  "Last Name: " + lname + "\nFirst Name: " + fname + "\nEmployee ID: " 
					+ ID + "\nBirthday: " + birthday.get(Calendar.MONTH) + "/" + 
					birthday.get(Calendar.DAY_OF_MONTH) +"/" + birthday.get(Calendar.YEAR) + "\nInsurance: "+insurance;
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
		
		public void setInsurance(String on) {
			insurance = "NON-ACTIVE";
			if(on.equalsIgnoreCase("On")) {
				insurance = "ACTIVATED";
			}
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
		
		public void setEducation(Education edu) {
			this.edu = edu;
		}

	/**
	 * Determines which last name is greater for sorting (descending order)
	 * @param e employee object of
	 * @return int comparing
	 */
	public int compareTo(Employees e)
	{
		return (e.getlname().compareTo(this.getlname()));
	}



}
