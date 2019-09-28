import java.util.Arrays;

public class employeeTester {
	
	public static void main(String[] args) {
		System.out.println("A) All Employee Info\n");
		Employee[] names = new Employee[9];
		//Faculty
		Faculty p1 = new Faculty("Anne", "Johnson", "F", "243",62,4,27, "Full", new Education("Ph.D","Engineering",3));
		Faculty p2 = new Faculty("Bouris", "William", "M", "791", 75,3,14, "AO", new Education("Ph.D","English",1));
		Faculty p3 = new Faculty("Andrade", "Christopher", "M", "623",80,5,22, "AS", new Education("MS", "Physical Educaion", 0));
		names[0] = p1;
		names[1] = p2;
		names[2] = p3;
		System.out.println("~~~~~~~~~~Faculty~~~~~~~~~~\n" + p1.toString()+"\n");
		System.out.println(p2.toString()+"\n");
		System.out.println(p3.toString() + "\n");
		//Staff
		Staff p4 = new Staff("Allen", "Paita", "M", "123", 59, 2, 23, 50.00);
		Staff p5 = new Staff("Zapata", "Steven", "M", "456", 64, 7 ,12, 35.00);
		Staff p6 = new Staff("Rios", "Enrique", "M", "789", 70,6,2,40.00);
		names[3] = p4;
		names[4] = p5;
		names[5] = p6;
		System.out.println("~~~~~~~~~~Staff~~~~~~~~~~~\n" + p4.toString() + "\n");
		System.out.println(p5.toString() + "\n");
		System.out.println(p6.toString() + "\n");
		//Part time
		Part_Time p7 = new Part_Time("Guzman","Augusto", "455", "M", 77,8,10,35.00, 30);
		Part_Time p8 = new Part_Time("Depirro", "Martin", "678", "M",87,9,15, 30.00, 15);
		Part_Time p9 = new Part_Time("Marque" , "Aldaco", "945", "M",88,11,24, 20.00, 35);
		names[6] = p7;
		names[7] = p8;
		names[8] = p9;
		System.out.println("~~~~~~~~~~Part Time~~~~~~~~~~~\n" + p7.toString() + "\n");
		System.out.println(p8.toString() + "\n");
		System.out.println(p9.toString() + "\n");
		System.out.println("B) Total monthly salary for all part-time staff: " + msPartTime(names));
		System.out.println("\nC) Total monthly slaary for all employees : " + msALL(names));
		System.out.println("\nD) Employee information in ascending by employee ID\n");
		sortID(names);
		System.out.println("\nE) Employee information in descending by employee last name\n");
		sortLname(names);
		
		System.out.println("\nF) Verifying cloning works!\n");
		Faculty f = (Faculty) names[0];
		try{
			Faculty fc = (Faculty) f.clone();
			System.out.println("\nFaculty : \n" + f.toString());
			System.out.println("\nClone : \n" + fc.toString());
			fc.setEducation(new Education("Masters","Engineering",10));
			System.out.println("\nThe clone has been changed");
			System.out.println("\nFaculty : \n" + f.toString());
			System.out.println("\nClone : \n" + fc.toString());
		}
		catch(CloneNotSupportedException e){
			System.out.println("Not cloneable");
		}
		
	}
	
	/**
	 * Computes sum of all part-time employee monthly earnings
	 * @param names, list of all employees
	 */
	public static double msPartTime(Employee names[]) {
		double sum = 0.0;
		for(int i = 0; i < names.length; i++) {
			if(names[i] instanceof Part_Time) {
				sum += names[i].monthlyEarnings();
			}
		}
		return sum;
		
	}
	
	/**
	 * Computes sum of all employee monthly earnings
	 * @param names, list of all employees
	 */
	public static double msALL(Employee names[]) {
		double total = 0.0;
		for(int i = 0; i < names.length; i++) {
			total += names[i].monthlyEarnings();
		}
		return total;
	}
	
	/**
	 * Sorts all employees by their ID number i
	 * @param names, list of all employees
	 */
	public static void sortID(Employee names[]) {
		Arrays.sort(names,new IDsort());;
		Display(names);
	}
	
	/**
	 * Sorts all employees by their last name in Descending order
	 * @param names, list of all employees
	 */
	public static void sortLname(Employee names[]) {
		Arrays.sort(names);
		Display(names);
	}
	
	/**
	 * Prints outs all employees in from index 0
	 * @param names, list of all employees
	 */
	public static void Display(Employee names[]){
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i].toString() + "\n");
		}
	}
}
