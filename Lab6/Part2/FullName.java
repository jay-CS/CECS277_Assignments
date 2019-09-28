package Part2;

public class FullName implements FullNameInterface {
	//First name
	private String first; 
	//Last name
	private String last;
	
	/**
	 * Initializes instance variable
	 */
	public FullName() {
		first = " ";
		last = " ";
	}
	
	/**
	 * Initializes instance variable
	 * @param l, the full name
	 */
	public FullName(String l) {
		String[] name = l.split(" ");
		first = name[0];
		last = name[1];
	}
	
	/**
	 * Sets the first name to the String f
	 */
	public void setFirstName(String f) {
		first = f;
	}
	
	/**
	 * Sets the last name to the String l
	 */
	public void setLastName(String l) {
		last = l;
	}
	
	/**
	 * Returns the first name
	 */
	public String getFirstName() {
		return first;
	}
	
	/**
	 * Returns the last name
	 */
	public String getLastName() {
		return last;
	}

}
