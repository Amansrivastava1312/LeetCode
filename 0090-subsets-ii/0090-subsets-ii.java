class Solution {
     public void sub (int idx , List<List<Integer>> res,  List<Integer> curr , int [] nums){
        res.add(new ArrayList(curr));
        
        for(int i = idx ; i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            curr.add(nums[i]);
            sub(i+1,res,curr,nums);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(nums);
        sub(0,res,new ArrayList(),nums);
        return res;
    }
}


