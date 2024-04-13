class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length+1];
        
        for(int i=0;i<freq.length;i++){
            freq[nums[i]]++;
            if(freq[nums[i]]>1){
                return nums[i];
            }
        }
        return -1;
    }
}