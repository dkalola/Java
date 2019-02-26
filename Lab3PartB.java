//This program contains the Scanner class
// Includes questions 4 to 7

import java.util.Scanner;
import java.lang.Math;

public class Lab3PartB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the Length : ");
		double L = scan.nextInt();
		
		System.out.println("Please enter the Width : ");
		double W = scan.nextInt();
		
		double area = (L * W);
		
		System.out.println("Area : "+ area);
		
		System.out.println("Please enter the Width : ");
		double r = scan.nextInt();
		double circumference = (2*Math.PI*r);
		scan.close();
		System.out.println("Circumference: "+circumference);
		System.out.println("Calculating question 7:" + Math.sqrt((r)/(W*L*2)) );
		
	}

}
