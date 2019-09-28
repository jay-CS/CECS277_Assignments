import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Faculty implements Employees,EmployeeInfo, Comparable<Employees>, Serializable {
	
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
		 * @param first, the first name of employee
		 * @param last, the last name of the employee
		 * @param sex, the gender of the employee
		 * @param id, the employees ID number
		 * @param year, the birth year
		 * @param month, the birth month
		 * @param day, the birth day
		 */
		public Faculty(String first, String last, String sex, String id, int year, int month, int day, String level,Education edu) {
			lname = last;
			fname = first;
			ID = id;
			gender = sex;
			birthday.set(year, month, day);
			this.level = level;
			this.edu = edu;
			insurance = "OFF";
		}
		
		/**
		 * Returns the instance variables in a string format
		 */
		public String toString() {	
			return  "Last Name: " + lname + "\nFirst Name: " + fname + "\nEmployee ID: " 
					+ ID + "\nBirthday: " + birthday.get(Calendar.MONTH) + "/" + 
					birthday.get(Calendar.DAY_OF_MONTH) +"/" + birthday.get(Calendar.YEAR) + "\nInsurance: " + insurance;
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
		
		public void setEducation(Education edu) {
			this.edu = edu;
		}
		
		/**
		 * @return the level of the method 
		 */
		public String getLevel() {
			return level;
		}
		
		public void setInsurance(String on) {
			insurance = "NON-ACTIVE";
			if(on.equalsIgnoreCase("On")) {
				insurance = "ACTIVATED";
			}
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
	 * Determines which last name is greater for sorting (descending order)
	 * @param e employee object of
	 * @return int comparing
	 */
	public int compareTo(Employees e)
	{
		return (e.getlname().compareTo(this.getlname()));
	}

}
