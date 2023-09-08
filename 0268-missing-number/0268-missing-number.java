class Solution {
    public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         int c=0;
//         int z=0;
//         for(int i=0;i<nums.length;i++){
//                 if(i!=nums[i]){
                    
//                     z=i;
//                     break;
//                 }
//                 c++;
//         }
//         if(c==nums.length){
//             return nums[nums.length-1]+1;
//                     }

//         return z;
        
       
    
    int n = nums.length;
    int sum1=n*(n+1)/2;
    int sum2=0;
        for(int i=0;i<n;i++){
            sum2+=nums[i];
        }
        
        return sum1-sum2;
        }
}