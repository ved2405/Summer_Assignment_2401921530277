class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
       for(int i = 0; i < s.length(); i++) {
            HashSet<Character> h = new HashSet<>();
            for(int j=i; j<s.length();j++){
                if(h.contains(s.charAt(j))){
                    break;
                }
                else{
                    h.add(s.charAt(j));
                }
            }
             max = Math.max(max,h.size());
        }
        return max;

    }
}
