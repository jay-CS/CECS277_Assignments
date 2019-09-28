import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;


public class Lottery {
	
	public static void main(String[] args) {
		TreeSet<Integer> user_ticket = getTicket();
		TreeSet<Integer> winning_num = generateWinningNumbers();
		System.out.println("Your ticket was: " + user_ticket.toString());
		System.out.println("Winning Numbers: " + winning_num);
		System.out.println("Matching Numbers " + matching(user_ticket,winning_num));
		System.out.println("Your Prize: $" + prize(matching(user_ticket,winning_num)));
	}
	
	/**
	 * Generates a set of Winning numbers
	 * @return win, the winning set of tnumbers
	 */
	public static TreeSet<Integer> generateWinningNumbers() {
		TreeSet<Integer> win = new TreeSet<Integer>();
		Random rand = new Random(System.currentTimeMillis());
		for(int i = 0; i < 7; i++) {
			int num = rand.nextInt(39) + 1;
			while(win.contains(num)) {
				num = rand.nextInt(39) + 1;
			}
			win.add(num);
		}
		return win;
	}
	
	/**
	 * Creates a lottery ticket for the user
	 * @return user_ticket, the user entered integer set
	 */
	public static TreeSet<Integer> getTicket() {
		Scanner in = new Scanner(System.in);
		int user_num;
		TreeSet<Integer> user_ticket = new TreeSet<Integer>();
		user_num = 0;
		int x = 0;
		System.out.print("Type 6 Lotto Numbers: ");
		while(x < 7) {
			user_num = in.nextInt();
			while(user_ticket.contains(user_num)) {
				user_num = in.nextInt();
			}
			user_ticket.add(user_num);
			x++;
		}
		return user_ticket;
	}
	
	/**
	 * Compares the numbers in each set to see if they are matching
	 * @param t1, is the first ticket
	 * @param t2, is the second ticket
	 * @return mathcning_nums, the set of matching numbers
	 */
	public static TreeSet<Integer> matching(TreeSet<Integer> t1, TreeSet<Integer> t2) {
		TreeSet<Integer> matching_nums = new TreeSet<Integer>();
		Iterator<Integer> it = t1.iterator();
		while(it.hasNext()) {
			Integer tree = it.next();
			if(t2.contains(tree)) {
				matching_nums.add(tree);
			}
		
		}
		return matching_nums;
	}
	
	/**
	 * Computes the winning prize amount
	 * @param matching, is the set of matching numbers
	 * @return prize, is the amount won
	 */
	public static int prize(TreeSet<Integer> matching) {
		int a = 0;
		int prize = 1;
		while(a < matching.size()) {
			if(prize == 1) {
				prize *= 5;
			}
			prize *= 10;
			a++;
		}
		return prize;
		
	}
}

