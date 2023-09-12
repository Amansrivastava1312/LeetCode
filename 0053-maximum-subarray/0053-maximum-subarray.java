class Solution {
    public int maxSubArray(int[] nums) {
        
        //Kadane's ALgo
        int sum=0;
        int max=Integer.MIN_VALUE;
        
        for(int n :nums){
            sum+=n;
            max=Math.max(sum,max);
            if(sum<0)sum=0;
        }
        
        return max;
    }
}