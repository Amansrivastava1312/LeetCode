class Solution {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        int indx =-1;
        
        //to find dip in array 
        
        for(int i =n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                indx = i;
                break;
            }
        }
        
        
        if(indx ==-1){
            
            for(int i = 0; i < n/ 2; i++) {
            // Swapping the elements
            int j = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = j;
        }
            return ;
        }
        
        
        
        
        
        for(int j =n-1 ;j>indx ;j--){
            
            if(nums[j]>nums[indx]){
                int temp= nums[j];
                nums[j]=nums[indx];
                nums[indx]=temp;
                
                break;
            }
        }
        
        Arrays.sort(nums,indx+1,n);
        
        // for(int i = indx+1; i < (n-indx)/2; i--) {
        //     // Swapping the elements
        //     int j = nums[i];
        //     nums[i] = nums[n - i - 1];
        //     nums[n - i - 1] = j;
        // }
        
    }
}