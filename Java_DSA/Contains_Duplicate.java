package Java_DSA;
import java.util.*;

public class Contains_Duplicate {
    public static void main(String [] args) {
    	Contains_Duplicate uniValues = new Contains_Duplicate();
    	
    	ArrayList<Integer> setUnique = new ArrayList<>();
    	
    	
    	setUnique.add(25);
    	setUnique.add(22);
    	setUnique.add(36);
    	setUnique.add(87);
    	setUnique.add(25);
    	setUnique.add(93);
    	

    	
    	
    	System.out.println(uniValues.containsDuplicate(setUnique));
    }
    
    public  boolean containsDuplicate(List<Integer> values) {
    	
    	HashSet<Integer> unique = new HashSet<>();
    	for(int  key : unique) {
    		if(unique.contains(key)) {
    			return true;
    		}
    		unique.add(key);
    	}
    	return false;
    }
    
    
   // boolean findDuplicates(List<Type> keys) {
        // Replace Type with actual type of your key
     //   Set<Type> hashset = new HashSet<>();
     //for (Type key : keys) {
       //     if (hashset.contains(key)) {
         //       return true;
           // }
            //hashset.add(key);
        //}
        //return false;
	//}
}
