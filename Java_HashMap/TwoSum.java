package Java_DSA;
import java.util.*;


public class TwoSum {
	public static void main(String[] args) {
		TwoSum solution = new TwoSum();

        // Example usage
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices of the two numbers that add up to the target: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
	
public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> mapval = new HashMap<>();
        
        int n = nums.length;
    
        for(int i = 0;i<n;i++){
            int num = nums[i];
            int diff  = target - num;
                
                if(mapval.containsKey(diff)){
                    return new int[] {mapval.get(diff),i};         
                }
            mapval.put(num, i);
        }
        
        return new int [] {};
        
    }
}
