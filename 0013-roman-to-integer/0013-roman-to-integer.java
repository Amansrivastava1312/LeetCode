class Solution {
    public int romanToInt(String s) {
        int prev=0;
        int num =0;
        int sum=0;
        

        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            switch (ch){
                case 'I':
                    num=1;
                    break;
                case 'V':
                    num=5;
                    break;
                case 'X':
                    num=10;
                    break;
                case 'L':
                    num=50;
                    break;
                case 'C':
                    num=100;
                    break;
                case 'D':
                    num=500;
                    break;
                case 'M':
                    num=1000;
                    break;
            }
            if(num>=prev){
                sum+=num;
            }
            else{
                sum-=num;
            
            }
            prev=num;
        }
        return sum;
    }
}