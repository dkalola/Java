
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class OutputToTextFile {
	public static void main(String args[])
	{
		try {
		     Scanner in = new Scanner(System.in);

		     String Input;
		     String Done = "Done";
		     String output;
		     boolean logic = true;
		     
		     System.out.println("Please enter your filename: ");
		     output = in.next();
		     
		     PrintWriter out = new PrintWriter("E:\\"+output+".txt");
		     System.out.println("You can start typing: ");
		    do {  
		    Input = in.next();
		    
		    if(Done.equals(Input)) {
				   logic = false; // Breaks the loop when Done equals Input String
				   break;
			   }
		      
		   out.println(Input);
		  
		    }while(logic == true);
		    
		    out.close(); // CLose File
		    in.close(); // Close scan class
		      
		   }catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); // gives us notification of file not found
			}
		      
		
	}
}
