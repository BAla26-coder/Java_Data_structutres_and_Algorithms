package Java_DSA;
import java.util.*;

public class Happy_Number {
   // Happy number is a number when it returns 1 after square it.
	// If 19 ( 1*1 + 9*9 = 1 + 81 = 82 ---> 8*8 + 2*2 = 64 + 4 = 68 ---> 6*6 +8*8 = 36 + 64 = 100 -- 1*1 +0+0 = 1)
	// Hence, 19 is a happy number
	public static void  main(String [] args) {
		int n =1;
		
		System.out.println(IshappyNumber(n));
		
	}
	
	
	public static boolean IshappyNumber(int n) {
		if(n ==1 || n == -1) {
			return true;
		}
		HashSet<Integer> ValidNo = new HashSet<>();
		
		if(!ValidNo.contains(n)) {
			ValidNo.add(n);
			
			n = SquareOfNumber(n);
			
	         if(n == 1) {
	         	return true;	
		    }
		}
		return false;
	}
	
	
	public static  int SquareOfNumber(int n) {
		 int output = 0;
		 
		 while(n != 0) {
			 int digits = n % 10;        /*For Example :  19    19/10  remainder will be 9, So it will take 9 */
			 
			 digits = digits * digits;     //(if 9 ||  9*9 = 81
			 
			output += digits;
			 /* Here it will take the quotient which is one, And hence n != 0 because n = 1*/
			 
			 n = n/10;
			 }
		
		return output;
	}
}
