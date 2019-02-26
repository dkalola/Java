
import javax.swing.JFrame; // includes JFrame
import javax.swing.JTextField; // includes JTextField
import javax.swing.JButton; // includes JButton

public class Lab2PartB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("That is my JFrame"); // Defines frame and make "That is my JFrame" as heading
		 frame.setBounds(300,100,400,400); // Set the dimensions of the JFrame
		    
		 JTextField myText = new JTextField("My Text");// Defines JTextField as myText and fill it with "My Text"
		 myText.setBounds(150,100,90,40); //Set the dimensions of the JTextField
		 // NOTE: I have changed the Dimensions as the dimensions which was given was not perfect.
		 //myText.setBounds(50,50,80,40); // This is with the older dimension which was messy.
		
		   
		 JButton okButton = new JButton("OK"); //Defines the Button named "OK"
		 okButton.setBounds(150,150,90,40); // Set the dimensions of the JButton
		// NOTE: I have changed the Dimensions as the dimensions which was given was not perfect.   
		// okButton.setBounds(50,100,40,80); // This is with the older dimension which was messy
		    
		    frame.getContentPane().add(okButton); // Prints Button to Frame
		    frame.getContentPane().add(myText); // Prints JTextField to Frame
		    
		    frame.setLayout(null); // Defines the Layout to be Null.
		    frame.setVisible(true); // Makes the Frame visible 
		
		
	}


}
