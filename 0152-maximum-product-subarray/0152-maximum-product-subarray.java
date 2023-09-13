class Solution {
    public int maxProduct(int[] nums) {
        //kadanes algo extended or observation base
    
        // 4 cases 1 all even
        // odd negative 
        // even negative 
        // zeros
     int pre=1;
        int suf=1;
        long max=Integer.MIN_VALUE;
        
        for(int i=0;i<nums.length;i++){
            if(pre==0) pre=1;
            if(suf==0) suf=1;
            
            pre=pre*nums[i];
            suf=suf*nums[nums.length -1 -i];
            
            max=Math.max(max,Math.max(pre,suf));
            
        }
        return (int)max;
    }
}