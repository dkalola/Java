
/*
 * The result is:
 * fvar :=0.5000009
 * flvar :=0.5000001
 * 
 * The program rounded off the value of 0.50000009 to 0.5000001 for "flvar"
 * But for "fvar" the value was not rounded off it was = 0.5000009. 
 * 
 * In the case of dvar the value 0.50000009 was not rounded off to 0.5000001.
 * This is because double can hold upto 8 bytes which is double the size of float.
 * */


public class Double_Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float fvar =  0.5000009f;
		float flvar = 0.50000009f;
		double dvar = 0.50000009;
		
		System.out.println("fvar :="+ fvar);
		System.out.println("flvar :="+ flvar);
		System.out.println("dvar :="+ dvar);
		
	}

}
