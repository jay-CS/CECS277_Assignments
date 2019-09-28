import java.util.Comparator;

public class IDsort implements Comparator<Employee> {
	//sub for compareTo
	public int compare(Employee e1, Employee e2){
		int a1 = Integer.parseInt(e1.getID());
		int a2 = Integer.parseInt(e2.getID());
		return a1 - a2;
	}
}
