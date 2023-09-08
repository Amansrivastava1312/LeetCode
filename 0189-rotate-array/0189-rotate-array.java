class Solution {
    public static void reverse(int[] nums , int start ,int end){
        
        while(start<end){
            int temp =nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
        }
        
    }
    public void rotate(int[] nums, int k) {
        
        //bcoz rotation the arrar by its length it will com to same place 
        k=k%nums.length;
        // reverse the whole array
        reverse(nums,0,nums.length-1);
        //reverse the first k element 
        reverse(nums,0,k-1);
        //reverse remaining 
        reverse(nums,k,nums.length-1);
        
         
    }
}