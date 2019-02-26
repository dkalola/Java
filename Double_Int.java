
/*
 * The code gives the output as:
 * Integer := 2
 * Double := 2.0
 * 
 * Because integer rounds of the value to nearest whole number.
 * Where double gives the value in decimal number.
 * */

/*
 * After casting the value of ifive and dfive are now same*/

public class Double_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ifive = 5/2;
		double ifivep = (int)ifive;
		double dfive = 5/2;
		
	
		System.out.println("Integer := "+ ifivep);
		System.out.println("Double := "+ dfive);
	}

}
