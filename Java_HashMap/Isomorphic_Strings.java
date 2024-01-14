package Java_DSA;
import java.util.*;

public class Isomorphic_Strings {
	public static void main(String[] args) {
		Isomorphic_Strings solution = new Isomorphic_Strings();

        // Example usage
        String s1 = "egg";
        String t1 = "add";
        System.out.println("Isomorphic test 1: " + solution.isIsomorphic(s1, t1)); // Output: true

        String s2 = "foo";
        String t2 = "bar";
        System.out.println("Isomorphic test 2: " + solution.isIsomorphic(s2, t2)); // Output: false

        String s3 = "paper";
        String t3 = "title";
        System.out.println("Isomorphic test 3: " + solution.isIsomorphic(s3, t3)); // Output: true
    }
	
	
	public boolean isIsomorphic(String s, String t) {
        
	       HashMap<Character, Character> mapS = new HashMap<>();
	        HashMap<Character, Character> mapT = new HashMap<>();

	        int s1=0, t1=0;

	        while(s1 < s.length() && t1 < t.length()){
	            if((mapS.containsKey(s.charAt(s1)) && mapS.get(s.charAt(s1)) != t.charAt(t1)) ||
	            (mapT.containsKey(t.charAt(t1)) && mapT.get(t.charAt(t1)) != s.charAt(s1))){
	                return false;
	            }
	            mapS.put(s.charAt(s1), t.charAt(t1));
	            mapT.put(t.charAt(t1), s.charAt(s1));
	            s1 += 1;
	            t1 += 1;
	        }
	        return true;
	    }
}
