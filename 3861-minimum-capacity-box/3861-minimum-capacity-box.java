class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
    int idx =-1 ;
    int min = 101;
    for(int i =0 ; i<capacity.length;i++){
        int num  = capacity[i];
        if(num< min &&  num >=itemSize){
                min = num;
                    idx =i;
        }
            
    }

        return idx;
    }
}