package Part2;

import java.util.HashSet;
import java.util.Set;

public class FNI_TESTER {

	public static void main(String[] args) {
		//SimpleName me = new SimpleName("Jonathan Bazan");
		Set<Integer> h = new HashSet<Integer>();
		
		
		FullNameInterface n1 = new fullname_adapter(new SimpleName("Jonathan Bazan"));
		n1.setFirstName("Jay");
		n1.setLastName("Bazan");
		System.out.println(n1.getFirstName() + " " + n1.getLastName());	
		SimpleName p1 = new SimpleName("Jake Douglass");
		FullNameInterface n2 = new fullname_adapter(p1);
		System.out.println("\n" + n2.getFirstName() + " " + n2.getLastName());
	}
}
