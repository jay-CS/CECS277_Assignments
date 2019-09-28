
public class Education implements Cloneable{
	//the degrees
	private String degree;
	
	//the major
	private String major;
	
	//the amount of researches par-taken in 
	private int researches;
	
	/**
	 * Initializes instance variables to deafult values
	 */
	public Education() {
		degree = " ";
		major = " ";
		researches = 0;
	}
	
	/**
	 * Initializes instance variables for education
	 * @param deg
	 * @param mj
	 * @param research
	 */
	public Education(String deg, String mj, int research) {
		degree = deg;
		major = mj;
		researches = research;
	}
	
	/**
	 * @return degree, returns the degree
	 */
	public String getDegree() {
		return degree;
	}
	
	/**
	 * @return major, returns the major
	 */
	public String getMajor() {
		return major;
	}
	
	/**
	 * @return researches, the amount of research par-taken in 
	 */
	public int getResearch() {
		return researches;
	}
	
	/**
	 * Sets the degree 
	 * @param deg, is the new degree of employee
	 */
	public void setDegree(String deg) {
		degree = deg;
	}
	
	/**
	 * Sets the major 
	 * @param mj, the new String major
	 */
	public void setMajor(String mj) {
		major = mj;
	}
	
	/**
	 * Sets the amount of research
	 * @param research, is the new research number
	 */
	public void setResearch(int research) {
		researches = research;
	}
	
	/**
	 * Returns the user information and there education
	 */
	public String toString() {
		return "\nDegree: " + degree + "\nMajor: " + major + "\nResearch: " + researches;
	}
	
	/**
	 * CLones an object that is a deep copy
	 */
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
