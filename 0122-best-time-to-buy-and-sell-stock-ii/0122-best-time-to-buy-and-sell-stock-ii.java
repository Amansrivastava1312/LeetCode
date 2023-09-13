class Solution {
    public int maxProfit(int[] prices) {
   int p1=0;
        int p2=1;
        int profit=0;
       while(p2<prices.length){
           if(prices[p1]< prices[p2]){
                profit+=(prices[p2]-prices[p1]);
                p1++;
           }
           else{
               p1=p2;
           }
           p2++;
       }
       return profit;

        
        

    }
}