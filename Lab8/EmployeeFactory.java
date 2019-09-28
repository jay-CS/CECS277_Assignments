

public class EmployeeFactory {
	
	public Employees getEmployee(String type, String fname, String lname, String gender, String ID, int year, int month, int day, double hourly, double worked, String level, Education edu) {
		if(type.equalsIgnoreCase("Staff")) {
			return new Staff(fname, lname,  gender, ID, year,  month, day, hourly);
		}
		
		else if(type.equalsIgnoreCase("Faculty")) {
			return new Faculty(fname, lname,  gender, ID, year,  month, day, level, edu);
		}
		
		else if(type.equalsIgnoreCase("PartTime")) {
			return new PartTime(fname, lname,  gender, ID, year,  month, day, hourly, worked);
		}
		return null;
	}
	
	
}
