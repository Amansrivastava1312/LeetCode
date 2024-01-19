class Solution {
    
    void permutations( List<List<Integer>> res ,List<Integer> ans, boolean[] freq,int[] nums){
        if(ans.size() == nums.length){
            res.add(new ArrayList(ans));
        }
        
        for(int i =0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                
                ans.add(nums[i]);
                permutations(res,ans,freq,nums);
                ans.remove(ans.size()-1);
                freq[i]=false;
            }
        }
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        boolean[] frequency = new boolean[nums.length];
        
        permutations(res,ans,frequency,nums);
        return res;
    }
}