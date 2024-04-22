class Solution {
    public int numberOfSubstrings(String s) {
        int[] hash = new int[3];
        int count=0;
        //hash[0]=a hash[1]=b hash[2]=c
        hash[0]=-1;
        hash[1]=-1;
        hash[2]=-1;
        
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                hash[0]=i;
            }
            if(s.charAt(i)=='b'){
                hash[1]=i;
            }
            if(s.charAt(i)=='c'){
                hash[2]=i;
            }
            
            if(hash[0]>=0 && hash[1]>=0 && hash[2]>=0){
                int min = Math.min(hash[0],hash[1]);
                int fmin= Math.min(min,hash[2]);
                count+=fmin+1;
            }
        }
        return count;
    }
}