class Solution {
    int helper(int[] nums , int goal){
        int l=0; int r=0; int count=0; int sum=0;
        if(goal<0)return 0;
        while(r<nums.length){
            sum+=nums[r];
            
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            count=count+r-l+1;
            r++;
        }
        return count;
        
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int[] dummy = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                dummy[i]=0;
            }else{
                dummy[i]=1;
            }
        }
        
        return helper(dummy,k)- helper(dummy,k-1);
    }
}