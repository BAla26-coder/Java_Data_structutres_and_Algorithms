class Solution {
   public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Count the frequency of each element in nums1
        for (int num : nums1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Iterate through nums2 and check for common elements
        for (int num : nums2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                result.add(num);
                frequencyMap.put(num, frequencyMap.get(num) - 1);
            }
        }

        // Convert the list to an array
        int[] intersection = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersection[i] = result.get(i);
        }

        return intersection;
    }
}j
