
public class Classes {
	//Is the name of the class
	String classes;
	//Is the grade for the class
	Grades grade;
	
	/**
	 * Initializes instance variable classes
	 */
	public Classes() {
		classes = " ";
	}
	
	/**
	 * Initializes instance variables
	 * @param clss, is the class
	 * @param grd, is the grade
	 */
	public Classes(String clss, Grades grd) {
		classes = clss;
		grade = grd;
	}
	
	/**
	 * Gets the class
	 * @return classes, is the students class
	 */
	public String getClasses() {
		return classes;
	}
	
	/**
	 * Sets the students class
	 * @param clss, is the new class
	 */
	public void setClass(String clss) {
		classes = clss;
	}
	
	/**
	 * Computes the value of the grade
	 * @return a double depending on the grade
	 */
	public double getVal() {
		if(grade.getGrade() == 'A') {
			return 4.0;	
		}
		else if(grade.getGrade() == 'B') {
			return 3.0;
		}
		else if(grade.getGrade() == 'C') {
			return 2.0;
		}
		else if(grade.getGrade() == 'D') {
			return 1.0;
		}
		else {
			return 0.0;
		}
	}
	
	/**
	 * Returns the classes and grade as a string
	 */
	@Override
	public String toString() {
		return "Class: " + classes + " Grade: " + grade.getGrade();
	}
}
