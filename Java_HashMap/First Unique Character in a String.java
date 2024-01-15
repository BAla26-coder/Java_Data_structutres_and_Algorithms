class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character ,Integer> charval = new HashMap<>();
        
        for (char val : s.toCharArray()) {
        charval.put(val, charval.getOrDefault(val, 0) + 1);
    }
        
        for(int i =0;i<s.length();i++){
            if(charval.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}