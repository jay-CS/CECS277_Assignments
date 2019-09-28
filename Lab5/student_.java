import java.util.Comparator;

public class student_ implements Comparable<student_> {
	//the first name of student
	String fname;
	
	//the last name of student
	String lname;
	
	//the ID of the the student
	int ID;
	
	
	/**
	 * @param first, first name
	 * @param last, last name
	 * @param grd, grade
	 * @param id, ID
	 */
	public student_(String first, String last,int id) {
		fname = first;
		lname = last;
		ID = id;
	}

	
	/**
	 * Returns the object as a string
	 */
	public String toString() {
		return "First name: " + fname + "\nLast name: " +
				lname + "\nID: " + ID;
	}
	
	/**
	 * Hashes the student's full name 
	 * @return
	 */
	public int Hash() {
		final int HASH_MULTIPLIER = 29;
		int h = HASH_MULTIPLIER * fname.hashCode() + lname.hashCode();
		h = HASH_MULTIPLIER * h + ((Integer)ID).hashCode();
		return h;
		}
	
	/**
	 * Compares student object by last name, then first name, the ID
	 */
	public int compareTo(student_ s1) {
		
		if(this.lname.equals(s1.lname)) {
			if(this.fname.equals(s1.fname)) {
				return s1.ID - this.ID;
			}
			return this.fname.compareTo(s1.fname);
		}
		return this.lname.compareTo(s1.lname);
	}	
}
