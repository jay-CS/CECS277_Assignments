
public class Grades {
	//Is the students grade
	private char grade;
	
	/**
	 * Initializes grade to a blank parameter
	 */
	public Grades() {
		grade = ' ';
	}
	
	/**
	 * Sets the grade for the class
	 * @param grade, is the student's grade
	 */
	public Grades(char grade) {
		this.grade = grade;
	}
	
	/**
	 * @return grade, returns the grade
	 */
	public char getGrade() {
		return grade;
	}
	
	/**
	 * Sets the grade 
	 * @param grd, is teh students grade
	 */
	public void setGrade(char grd) {
		grade = grd;
	}
	
}

