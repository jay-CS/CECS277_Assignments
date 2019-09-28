package Part2;
public class fullname_adapter implements FullNameInterface{
	//FullNameInterface variable
	SimpleName name;
	String fname;
	String lname;
	
	/**
	 * initializes instance variable
	 * @param FNI, FullNameInterface object
	 */
	public fullname_adapter(SimpleName name) {
		this.name = name;
		String[] full = name.getName().split(" ");
		fname = full[0];
		lname = full[1];
	}
	
	/**
	 * Sets the name of the user
	 */
	public void setFirstName(String f) {
		fname = f;
	}
	
	public void setLastName(String l) {
		lname = l;
	}
	
	public String getFirstName() {
		return fname;
	}
	
	public String getLastName() {
		return lname;
	}
}
