class Solution {
    public int nextGreaterElement(int n) {
        char[] nums = (n + "").toCharArray();
         
        int i,j;
        //start from right side find the first dip
        for( i =nums.length-1;i>0;i--){
            if(nums[i-1] < nums[i])
                break;
        }
        
        if(i==0) return -1;  //no dip find and this will be largest num
        
        // find nxt greater element then that num but the minimum number in right side
       int smallest = i; 
        int number=i-1;
        
        for( j = i+1;j<nums.length;j++){
            if(nums[j]>nums[number] && nums[j]<=nums[smallest]){
                smallest = j;
            }
        }
        //swap
        
        char temp = nums[number];
        nums[number]=nums[smallest];
        nums[smallest]=temp;
        
        Arrays.sort(nums,i,nums.length);
        
        long val = Long.parseLong(new String(nums));
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
        }
    }










