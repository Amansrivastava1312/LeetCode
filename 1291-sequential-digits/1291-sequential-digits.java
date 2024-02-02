class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        
        for(int i=1;i<=9;i++){
            
            int num = i;
            int nxtDigit = i+1;
            
            while(num<=high && nxtDigit<=9){
                num=num*10+nxtDigit;
                if(num>=low &num<=high){
                    res.add(num);
                }
                nxtDigit++;
            }
        }
        res.sort(null);
        return res;
    }
}