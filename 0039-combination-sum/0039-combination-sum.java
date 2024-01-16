class Solution {
    
    public void seq(int ind , int[] can , int target, List<List<Integer>> res,List<Integer> curr){
        
        if(ind == can.length){
            if(target == 0){
                res.add(new ArrayList<>(curr));
            }
            return;
            
        }
           if(can[ind]<=target){
           curr.add(can[ind]);
           seq(ind,can,target - can[ind],res,curr);
           curr.remove(curr.size() -1);}
        
            seq(ind +1,can,target,res,curr);
        
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        seq(0,candidates,target,res,new ArrayList<>());
        return res;
    }
}