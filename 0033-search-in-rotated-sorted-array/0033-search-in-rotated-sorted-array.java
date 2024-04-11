class Solution {
    
    int searchBinary(int[] nums,int left , int right, int target){
        if(left>right){
            return -1;
        }
        
        int mid = left +((right-left)/2);
        
        if(nums[mid]==target){
            return mid;
        }
        
        //if left half is sorted
        if(nums[mid]>=nums[left]){
            
            if(nums[left]<=target && target<=nums[mid]){
                return searchBinary(nums,left,mid-1,target);
            }
            else{
                return searchBinary(nums,mid+1,right,target);
            }
            
        }
        //if right half is sorted
        else{
            if(nums[mid]<=target && target<=nums[right]){
                return searchBinary(nums,mid+1,right,target);
            } 
            else{
                return searchBinary(nums,left,mid-1,target);
            }
        }
    }
    public int search(int[] nums, int target) {
        
        return searchBinary(nums,0,nums.length-1,target);
    }
}