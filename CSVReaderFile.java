import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReaderFile {
	public static void main(String args[])
	{
		String src = "E:\\grades.csv";
		
		double total = 0,marks = 0;
		double mean = 0;
		int i = 0;
		File file = new File(src);
		
		try {
			Scanner inputStream = new Scanner(file);
			
			 while(inputStream.hasNext()){
				 	
				 	i++; // counts the number that it read
	                String data = inputStream.next();
	                marks = Integer.parseInt(data); // converts the string to int 
	                total = marks + total;
	               
	            }
	        
	            inputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // gives us notification of file not found
		}
		
		 mean = total/i;
         System.out.println("Average Grade: "+ mean);
	
		
		
	}

}
