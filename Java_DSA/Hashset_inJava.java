package Java_DSA;
import java.util.*;

public class Hashset_inJava {

	public static void main(String [] args) {
		
		
		   HashSet<Integer> set = new HashSet<>();	
		  
		   set.add(1);
		   set.add(3);
		   set.add(33);
		   set.add(2);
		   
            for(int i : set) {
			   
			   System.out.println(i +" ");
		   }
		   
		   set.remove(2);
		   System.out.println("Here it is not removing the value based on index "+ set);
		   
		   if(!set.contains(3)) {
			   System.out.println("The value is present ");
		   }
		   
		   
		   if(set.contains(1)) {
			   System.out.println("The value is present");
		   }
		   else {
			   System.out.println("There is no such element");
	      }
		   set.clear();
		   
		   if(set.isEmpty()) {
			   System.out.println("The set is empty Now!");
		   }
	}
	

}
