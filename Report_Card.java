
public class Report_Card {
	//Array of classes student is taking
	Classes classes[];
	//Gpa of student
	double gpa = 0.0; 
	
	//Initializes the instance variables classes
	public Report_Card() {
		classes = null;
	}
	
	/**
	 * Initializes classes
	 * @param clss, is set to classes array
	 */
	public Report_Card(Classes clss[]) {
		classes = clss;
	}
	
	/**
	 * Computes the gpa of student
	 * @return gpa, is the gpa
	 */
	public double getGPA() {
		for(int i = 0; i < classes.length; i++) {
			gpa += classes[i].getVal();
		}
		return gpa;
	}
	
	/**
	 * Sets the classes for the student
	 * @param cls, is the classes student is taking
	 */
	public void setClasses(Classes cls[]) {
		classes = cls;
	}
	
	/**
	 * Returns gpa as a string
	 */
	@Override
	public String toString() {
		return String.format("\nStudent GPA is: %.2f", getGPA()/(classes.length)); 
	}
	
	/**
	 * Displays the classes the student is taking with their grade
	 */
	public void displayClasses() {
		for(int i = 0; i < classes.length; i++) {
			System.out.println((i+1) + ") " + classes[i].toString());
		}
	}
}
