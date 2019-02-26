
// Part A of Lab 2

public class OrderofOpereation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//The variables are set to Zero as there are not readings available yet.
		int sugarLevel0 = 0; // Currently the value is Zero as there was no predefined value
		int sugarLevel1 = 0;// Currently the value is Zero as there was no predefined value
		double sugarLevel2 = 0; // Currently the value is Zero as there was no predefined value
		
		/*
		 * 
		 *                   (sugarlevel2 - sugarlevel1)
		 * sugarRateChange = ---------------------------
		 * 					 (sugarlevel1 - sugarlevel0)	
		 * 
		 * */
		
		double sugarRateChange = ((sugarLevel2 - sugarLevel1)/(sugarLevel1 - sugarLevel0));
		
		
		System.out.println("Sugar Rate Change: "+ sugarRateChange);
		
	}

}
