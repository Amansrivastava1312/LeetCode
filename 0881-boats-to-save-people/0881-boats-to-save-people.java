class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
       int sum=0;
        int i =0;
        int j=people.length-1;
        int res=0;
        while(i<=j){
            sum=people[i]+people[j];
                if(sum<=limit){
                    res++;
                    i++;
                    j--;
                }
                else  {
                    res++;
                    j--;
                }
          
            
        }
       
        
        return res;
        
    }
}