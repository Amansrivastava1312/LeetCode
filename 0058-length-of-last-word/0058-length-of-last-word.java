class Solution {
    public int lengthOfLastWord(String s) {
        int curLen = 0;
        int lastLen = 0;
        for (int i = 0; i < s.length(); i ++) {
            char c = s.charAt(i);
            if (c != ' ') {
                curLen += 1;
                lastLen = curLen;
            } else { 
                curLen = 0;
            }
        }
        return lastLen;
    }
}