import java.util.Random;

public class ReportCardTester {

	public static void main(String[] args) {
		String everyclass[] = {"Algebra 1", "Spanish 1 ", "English 1", "Biology", "Physical Education", "Philosophy", "World History ", 
				"Chemistry", "Algebra 2 ", "English 2 ","Spanish 2 ", "Women Spirituality", "A.P. U.S. History", "Precalculus", 
				"American Literature ", "Spanish Literature ", "A.P. Computer Science ", "A.P. Literature ", "A.P. Physics 1 ",
				"A.P. Government", "A.P. Economics ", "A.P. Calculus 2 ", "A.P. Chemistry ", "A.P. Biology" };
		
		char Grades[] = {'A', 'B','C','D','F'};
		Report_Card s1;
		Random rand = new Random();
		Classes classes[] = new Classes[6];
		for(int i =0; i < classes.length; i++ ) {
			int x = rand.nextInt(5);
			classes[i] = new Classes(everyclass[i], new Grades(Grades[x]));
		}
		s1 = new Report_Card(classes);
		s1.displayClasses();
		System.out.println(s1.toString());
	}
	
}
