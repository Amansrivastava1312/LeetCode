class Solution {
    public int alternateDigitSum(int n) {
        int sum1=0 , sum2=0, flag =0;
        int len=0;
        while(n>0){
            int d = n%10;
            n=n/10;
            if(flag==0){
                flag=1;
                sum1+=d;
            }
            else{
                flag=0;
                sum2+=d;
            }
            len++;
        }
        
        if(len%2==0){
            return sum2-sum1;
        }
        else{
            return sum1-sum2;
        }
    }
}