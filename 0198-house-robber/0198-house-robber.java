class Solution {
    public int rob(int[] nums) {
           int[] arr = new int[nums.length];
        
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        
        
        arr[0]=nums[0];
        
        arr[1]=Math.max(nums[0],nums[1]);
        
        for(int i=2;i<nums.length;i++){
            arr[i]= Math.max(arr[i-1],arr[i-2]+nums[i]);
        }
        return arr[nums.length-1];
    }
}