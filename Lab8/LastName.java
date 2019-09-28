import java.util.Comparator;

/**
 * Sorts by ID number in ascending order
 */
public class LastName implements Comparator<Employees>
{
    public int compare(Employees a, Employees b)
    {
        String s1 = a.getlname();
        String s2 = b.getlname();

        return s1.compareTo(s2);
    }
}
