

/*
 * read the statement amount
 * read the number of days late
 * set total(statement amount * 0.07* number of days late)
 * output total
 * answer is 1715.0000000000002 ~ 1715.0
 */

public class lab1partA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int amount = 980, nbdays = 25;
		double interestrate = 0.07;
		double total = (amount *interestrate * nbdays);
		
		System.out.println(total);
	}

}
