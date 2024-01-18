class Solution {
    void seq(int ind , int[] can , int target, List<List<Integer>> res,List<Integer> curr){
           if(target == 0){
                res.add(new ArrayList<>(curr));
            return;
        }
           for(int i=ind;i<can.length;i++){
               if(i>ind && can[i]==can[i-1]) continue;
               if(can[i]>target) break;
           curr.add(can[i]);
           seq(i+1,can,target - can[i],res,curr);
           curr.remove(curr.size() -1);
           }
         
            
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        seq(0,candidates,target,res,new ArrayList<>());
        return res;
    }
}