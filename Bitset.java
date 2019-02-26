// Includes question 1 to 3
import java.util.*;

public class Bitset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		BitSet bits1 = new BitSet();
		BitSet bits2 = new BitSet();
		
		bits1.set(001);
		bits2.set(010);
		
		bits2.or(bits1);
		
		System.out.println("bits1:"+ bits1.toString());
		System.out.println("bits2:"+ bits2.toString());
	}

}
