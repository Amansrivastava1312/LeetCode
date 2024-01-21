class Solution {
    
    void part(int index , String s ,List<List<String>> res ,List<String> ans )
    {
        
        if(index==s.length()){
            res.add(new ArrayList<>(ans));
            return;
        }
        
        for(int i=index;i<s.length();++i){
            if(isPalindrome(s,index , i)){
                ans.add(s.substring(index,i+1));
                part(i+1,s,res,ans);
                ans.remove(ans.size()-1);
            }
        }
    }
    
    boolean isPalindrome (String s , int start , int end){
        while(start<=end){
                if(s.charAt(start++)!=s.charAt(end--)){
                    return false;
                    
                }
            // start++;
            // end--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        List<String> ans = new ArrayList<String>();
        
        part(0,s,res,ans);
        return res;
    }
}