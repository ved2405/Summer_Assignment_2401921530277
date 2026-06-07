class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        char temp;
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            temp = c;
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    return s;
                }
                if (c != strs[j].charAt(i)) {
                    return s;
                }
            }
            s = s + temp;
        }
        return s;
    }
}
