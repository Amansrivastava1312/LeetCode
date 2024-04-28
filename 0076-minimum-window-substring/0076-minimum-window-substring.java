class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        int l = 0; 
        int r = 0; 
        int startIndex = -1;
        int count = 0;
        int minLength = Integer.MAX_VALUE;
        
        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), 1);
            } else {
                int val = map.get(t.charAt(i));
                map.put(t.charAt(i), val + 1);
            }
        }
        
        while (r < s.length()) {
            char charR = s.charAt(r);
            if (map.containsKey(charR)) {
                if (map.get(charR) > 0) {
                    count++;
                }
                map.put(charR, map.get(charR) - 1);
            }
            
            while (count == t.length()) {
                if (r - l + 1 < minLength) {
                    minLength = r - l + 1;
                    startIndex = l;
                }
                char charL = s.charAt(l);
                if (map.containsKey(charL)) {
                    map.put(charL, map.get(charL) + 1);
                    if (map.get(charL) > 0) {
                        count--;
                    }
                }
                l++;
            }
            r++;
        }
        
        return startIndex == -1 ? "" : s.substring(startIndex, minLength + startIndex);
    }
}