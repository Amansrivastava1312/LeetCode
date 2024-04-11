class Solution {
    public String removeKdigits(String num, int k) {
        
        
        if(k==0) return num;
        if(num.length()==k) return "0" ;
        
        Stack<Character>  stack = new Stack<>();
        
        //delete previous greatest
        for(int i =0;i<num.length();i++){
            while(!stack.isEmpty() && k>0 & stack.peek() > num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        
        
        //if their is no previous greatest
        while(k>0){
            stack.pop();
            k--;
        }
        
        String res = "";
        while(!stack.isEmpty()){
            res = stack.pop() + res;
        } 
        
        System.out.print(res);
        
         int j=0;
        
        while(j<res.length()-1&&res.length()>1){
            if(res.charAt(j) == '0'){
                j++;
            }
            else{
                break;
            }
        }
        
       
        return res.substring(j,res.length());
        
    }
}