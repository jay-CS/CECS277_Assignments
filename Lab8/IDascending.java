
import java.util.Comparator;

	/**
	 * Sorts by ID number in ascending order
	 */
	public class IDascending implements Comparator<Employees>
	{
	    public int compare(Employees a, Employees b)
	    {
	        int a2 = Integer.parseInt(a.getID());
	        int b2 = Integer.parseInt(b.getID());

	        return a2 - b2;
	    }
	}

