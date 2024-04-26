import java.util.HashMap;
import java.util.Map;

class Solution {
    // Helper method to count the number of subarrays with at most k distinct elements
    int helper(int[] nums, int k) {
        // Map to store the frequency of elements in the current window
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // Two pointers to define the sliding window
        int l = 0; // Left pointer
        int r = 0; // Right pointer
        int count = 0; // Count of subarrays with at most k distinct elements

        // Loop over the array using the right pointer
        while (r < nums.length) {
            // Update the frequency of the current element in the map
            if (!map.containsKey(nums[r])) {
                map.put(nums[r], 1); // If the element is not in the map, add it with frequency 1
            } else {
                int curr = map.get(nums[r]);
                map.put(nums[r], curr + 1); // If the element is already in the map, increment its frequency
            }

            // Shrink the window from the left if the number of distinct elements exceeds k
            while (map.size() > k) {
                int val = map.get(nums[l]);
                map.put(nums[l], val - 1); // Decrement the frequency of the leftmost element
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]); // If the frequency becomes zero, remove the element from the map
                }
                l++; // Move the left pointer to the right
            }

            // Update the count by adding the number of subarrays ending at index r
            count = count + r - l + 1;
            r++; // Move the right pointer to the right
        }

        return count; // Return the total count of subarrays with at most k distinct elements
    }

    // Method to count the number of subarrays with exactly k distinct elements
    public int subarraysWithKDistinct(int[] nums, int k) {
        // Count the number of subarrays with at most k distinct elements and subtract
        // the count of subarrays with at most k-1 distinct elements to get the count
        // of subarrays with exactly k distinct elements
        return helper(nums, k) - helper(nums, k - 1);
    }
}
