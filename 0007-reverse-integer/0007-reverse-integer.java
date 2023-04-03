class Solution {
    public int reverse(int x) {
        long sum=0;
        int num=0;
        while(x!=0){
             num=x%10;
            sum+=num;
            sum=sum*10;
            x=x/10;
        }
        num=num/10;
        sum=sum/10;

        if( sum > Integer.MAX_VALUE ||sum < Integer.MIN_VALUE ){
            return 0;
        }
        if(num<0){
            return (int)(-1*sum);
        }
        return (int)(sum);
    }
}