// This program is upon the Array
//Includes questions 8 to 12

import java.util.*;

public class Lab3PartC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arr1 = new ArrayList();
		arr1.add(0,"Divyanshu");
		arr1.add(1,"Kalola");
		
		ArrayList arr2 = new ArrayList();
		
		arr2 = arr1;
		
		arr2.add("Daniel");
		
		System.out.print("Printing the First Element of arr2:  ");
		System.out.println(arr2.get(0));
		
		/*
		 * The result shows "Divyanshu" because when we assigned the values of arr1 to arr2
		 * The First and second element of arr2 because "Divyanshu" and "Kalola" and when 
		 * we added "Daneil" to the array it assigned "Daniel" to 3rd position in both the array
		 * as a default location as first two places were taken by "Divyanshu" and "kalola"
		 * */
		
		System.out.print("Printing the Size of arr1:  ");
		System.out.println(arr1.size());
		System.out.print("Printing the 3rd Element in arr1:  ");
		System.out.println(arr1.get(2));
		
		
	}

}
