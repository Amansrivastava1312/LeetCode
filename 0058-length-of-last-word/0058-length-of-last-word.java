class Solution {
    public int lengthOfLastWord(String s) {
        int cur = 0;
        int last = 0;
        for (int i = s.length()-1; i >= 0; i --) {
            char c = s.charAt(i);
            if (c != ' ') {
                cur += 1;
                last = cur;
            } else { 
                if(last>0)
                    return last;
                cur = 0;
            }
        }
        return last;
    }
}