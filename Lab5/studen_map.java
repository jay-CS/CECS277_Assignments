

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class studen_map {
	
	public static void main(String[] args) {
		HashMap<Integer, student_> hm = new HashMap<Integer,student_>();
		HashMap<student_, String> hm_grade = new HashMap<student_,String>();
	
		boolean cont = true;
		Scanner in = new Scanner(System.in);
		while(cont) {
			System.out.println("1) Add Student ");
			System.out.println("2) Remove Student ");
			System.out.println("3) Change Student Grade");
			System.out.println("4) Print All Grades ");
			int num = in.nextInt();
			in.nextLine();
			
			switch(num) {
				case 1:	System.out.println("Enter first name: ");
						String fname = in.nextLine();
						System.out.println("Enter last name: ");
						String lname = in.nextLine();
						System.out.println("Enter Grade: ");
						String grade = in.nextLine().trim();
						System.out.println("Enter ID: ");
						int id = in.nextInt();
						student_ stdnt = new student_(fname, lname, id);
						hm.put(id,stdnt);
						hm_grade.put(stdnt, grade);
						break;
						
				case 2: System.out.println("Enter student ID");
						int id_num = in.nextInt();
						if(hm.containsKey(id_num)) {
							student_ temp = hm.get(id_num);
							hm.remove(id_num);
							hm.remove(temp);
							hm_grade.remove(temp);
						}
						break;
						
				case 3: System.out.println("Enter student ID");
						int id_num1 = in.nextInt();
						String grd = "";
						in.nextLine();
						if(hm.containsKey(id_num1)) {
							System.out.println("Enter student grade: ");
							grd = in.nextLine();
							student_ temps = hm.get(id_num1);
							hm_grade.remove(temps);
							hm_grade.put(temps, grd);
						}
						break;
				
				
				case 4:
						if(hm_grade.size() > 0) {
							Set<student_> students = hm_grade.keySet();
							
							TreeSet<student_> newSet = new TreeSet<>(students);
							
							System.out.print("~~~~~~~~~~All Grades~~~~~~~~~");
							for(student_ s : newSet) {
								System.out.println("\nName: " + s.fname + " " + s.lname 
								+ "\nID: " + s.ID + "\nGrade: " + hm_grade.get(s));
							}
						}
						break;
						
				case 5 : cont = false;
						 break;
			}
		}
		
		
	}
	
	
	
}
