class Solution {
    public int removeDuplicates(int[] nums) {
        int c=1;
        int indx=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
               nums[indx]=nums[i+1];
               indx++;
               c++;
            }
            
             
                
            }
        
        return c;
    }
}