import java.util.HashMap;
import java.util.Map;

class Solution {
    int helper(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // key -- element 
        // value -- freq
        int l = 0;
        int r = 0;
        int count = 0;

        while (r < nums.length) {
            if (!map.containsKey(nums[r])) {
                map.put(nums[r], 1);
            } else {
                int curr = map.get(nums[r]);
                map.put(nums[r], curr + 1);
            }

            while (map.size() > k) {
                int val = map.get(nums[l]);
                map.put(nums[l], val - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }

            count = count + r - l + 1;
            r++;
        }

        return count;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);
    }
}
