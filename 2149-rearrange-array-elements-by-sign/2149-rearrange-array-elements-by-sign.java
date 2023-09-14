class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n= nums.length;
        int p1=0;
        int p2=1;
     
        int[] arr= new int[n];
        
        for(int i=0;i<n;i++){
            
            if(nums[i]<0){
                arr[p2]=nums[i];
                p2=p2+2;
            }
            else{
                arr[p1]=nums[i];
                p1=p1+2;
            }
        }
        
            
            
        return arr;
    }
}