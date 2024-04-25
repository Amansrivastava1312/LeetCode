class Solution {
    int helper(int[] nums , int goal){
        int l =0;
        int r=0;
        if(goal<0)return 0;
        int count =0;
        int sum=0;

        while(r<nums.length){
            sum+=nums[r];

            while(sum>goal){
                sum-=nums[l];
                l++;
            }

            count = count+r-l+1;
            r++;
        }
        return count;
    }
    
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)-helper(nums,goal-1);
    }
}