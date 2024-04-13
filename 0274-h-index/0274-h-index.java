class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        int max=0;
        for(int i =0;i<len;i++){
            max= Math.max(max,citations[i]);
        }
        //counting sort
        int[] arr = new int[max+1];
        
        for(int j=0;j<len;j++){
            arr[citations[j]]++;
        }
        
        int sum=0;
        int hIndex=0;
        
        for(int i = arr.length-1;i>=0;i--){
            sum+=arr[i];
            if(sum>=i){
                hIndex=i;
                break;
            }
        }
        
        return hIndex;
        
    }
}