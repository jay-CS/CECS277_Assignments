import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeTester {
	static SingletonState operator;
	public static void main(String[] args) throws Exception {
		System.out.println("A) All Employee Info\n");
		ArrayList<Employees> names = new ArrayList<Employees>();
		EmployeeFactory emp = new EmployeeFactory();
		names.add(emp.getEmployee("Faculty","Anne", "Johnson", "F", "243",62,4,27, 0.0, 0.0,"Full", new Education("Ph.D","Engineering",3)));
		names.add(emp.getEmployee("Faculty","Bouris", "William", "M", "791", 75,3,14, 0.0, 0.0, "AO", new Education("Ph.D","English",1)));
		names.add(emp.getEmployee("Faculty","Andrade", "Christopher", "M", "623",80,5,22, 0.0, 0.0,"AS", new Education("MS", "Physical Educaion", 0)));
		
		System.out.println("~~~~~~~~~~Faculty~~~~~~~~~~\n" + names.get(0).toString()+"\n");
		System.out.println(names.get(1).toString()+"\n");
		System.out.println(names.get(2).toString() + "\n");
		
		//Staff
		names.add(emp.getEmployee("Staff","Allen", "Paita", "M", "123", 59, 2, 23, 50.00,0.0," ",  null));
		names.add(emp.getEmployee("Staff","Zapata", "Steven", "M", "456", 64, 7 ,12, 35.00,0.0," ", null));
		names.add(emp.getEmployee("Staff", "Enrique", "Mendoza", "M", "789", 70,6,2,40.00,0.0," ", null));
		
		System.out.println("~~~~~~~~~~Staff~~~~~~~~~~~\n" + names.get(3).toString() + "\n");
		System.out.println(names.get(4).toString() + "\n");
		System.out.println(names.get(5).toString() + "\n");
		//Part time
		names.add(emp.getEmployee("PartTime", "Guzman","Augusto", "M", "456", 77,8,10,35.00, 30," ",null));
		names.add(emp.getEmployee("PartTime","Depirro", "Martin", "M", "678",87,9,15, 30.00, 15, " ",null));
		names.add(emp.getEmployee("PartTime", "Marque" , "Aldaco", "M", "945",88,11,24, 20.00, 35, " ",null));
		System.out.println("~~~~~~~~~~Part Time~~~~~~~~~~~\n" + names.get(6).toString() + "\n");
		System.out.println(names.get(7).toString() + "\n");
		System.out.println(names.get(8).toString() + "\n");
		System.out.println("B) Total monthly salary for all part-time staff: " + msPartTime(names));
		System.out.println("\nC) Total monthly salary for all employees : " + msALL(names));



		File f = new File("employees.dat"); //file for data storage

		//WRITING TO FILE
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		out.writeObject(names); //writing array list of employees to file
		out.close();


		//READING FROM FILE
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		//getting array list of employees from file
		ArrayList<Employees>  fileEmployees = (ArrayList<Employees>) in.readObject();
		in.close();

		//D
		System.out.println("\n\n\nD) Employee information ascending by employee ID:\n");
		Collections.sort(fileEmployees, new IDascending());
		for(Employees e : fileEmployees)
		{
			System.out.println(e.toString());
			System.out.println();
		}
		//WRITING TO FILE
		ObjectOutputStream out2 = new ObjectOutputStream(new FileOutputStream(new File("sortedByID.dat")));
		out2.writeObject(fileEmployees); //writing sorted array list of employees to file
		out2.close();

		//E
		System.out.println("\n\n\nE) Employee information descending by last name:\n");
		Collections.sort(fileEmployees, new LastNames());
		for(Employees e : fileEmployees)
		{
			System.out.println(e.toString());
			System.out.println();
		}
		//WRITING TO FILE
		ObjectOutputStream out3 = new ObjectOutputStream(new FileOutputStream(new File("sortedByLastName.dat")));
		out3.writeObject(fileEmployees); //writing sorted array list of employees to file
		out3.close();


		setInsurance(names);
		System.out.print("Insurance is Set!\n");
		System.out.println("~~~~~~~~~~Faculty~~~~~~~~~~\n" + names.get(0).toString()+"\n");
		System.out.println(names.get(1).toString()+"\n");
		System.out.println(names.get(2).toString() + "\n");
		System.out.println("~~~~~~~~~~Staff~~~~~~~~~~~\n" + names.get(3).toString() + "\n");
		System.out.println(names.get(4).toString() + "\n");
		System.out.println(names.get(5).toString() + "\n");
		System.out.println("~~~~~~~~~~Part Time~~~~~~~~~~~\n" + names.get(6).toString() + "\n");
		System.out.println(names.get(7).toString() + "\n");
		System.out.println(names.get(8).toString() + "\n");
	
		}
	
	/**
	 * Computes sum of all part-time employee monthly earnings
	 * @param names, list of all employees
	 */
	public static double msPartTime(ArrayList<Employees> names) {
		double sum = 0.0;
		for(int i = 0; i < names.size(); i++) {
			if(names.get(i) instanceof PartTime) {
				PartTime sub = (PartTime) names.get(i);
				sum += sub.monthlyEarnings();
			}
		}
		return sum;
	}


	/**
	 * Computes sum of all employee monthly earnings
	 * @param names, list of all employees
	 */
	public static double msALL(ArrayList<Employees> names) {
		double total = 0.0;
		for(int i = 0; i < names.size(); i++) {
			total += names.get(i).monthlyEarnings();
		}
		return total;
	}

	
	public static void setInsurance(ArrayList<Employees> names) {
		operator = operator.getInstance();
		Scanner in = new Scanner(System.in);
		String input = "";
		for(int i = 0; i < names.size(); i++) {
			System.out.println("Enter Y to activate company insurance");
			System.out.println("Enter N to deactivate company insurace");
			input = in.nextLine();
			operator.createContext(names.get(i),input);
		}
	}
}
