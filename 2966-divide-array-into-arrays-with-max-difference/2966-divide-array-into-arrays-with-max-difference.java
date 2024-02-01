class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] res = new int[nums.length / 3][3];
        int c=0;
        for(int i=2;i<nums.length;i+=3){
            int dif = nums[i] - nums[i-2];
            
            if(dif<=k){
                int[] arr = {nums[i-2],nums[i-1],nums[i]};
                res[c]=arr;
                c++ ;
            }else{
                return new int[0][];
            }
        }
      
        
    return res;
    }
}