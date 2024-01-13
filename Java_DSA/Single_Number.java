package Java_DSA;
import java.util.*;

public class Single_Number {

	  public static void main(String[] args) {
		  Single_Number main = new Single_Number();

	        int[] nums1 = {2, 2, 1};
	        System.out.println("Single Number in nums1: " + main.singleNumber(nums1));

	        int[] nums2 = {4, 1, 2, 1, 2};
	        System.out.println("Single Number in nums2: " + main.singleNumber(nums2));
	    }
	
	public int singleNumber(int[] nums) {
        int n = nums.length;

        if (n <= 1) {
            return nums[0];
        }

        HashSet<Integer> numSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (numSet.contains(nums[i])) {
                numSet.remove(nums[i]);
            } else {
                numSet.add(nums[i]);
            }
        }

        return numSet.iterator().next();
    }
	
}
