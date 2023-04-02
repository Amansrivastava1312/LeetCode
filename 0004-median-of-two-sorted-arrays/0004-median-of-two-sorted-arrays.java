


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int j = nums1.length + nums2.length;
        int[] arr = new int[j];
        for(int i =0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        int m=0;
        for(int k=nums1.length;k<j;k++){
                arr[k]=nums2[m];
                m++;
        }
        Arrays.sort(arr);

        if(j%2!=0){
            return arr[j/2 ];
        }
        else{
            float  y= arr[j/2 -1] + arr[(j/2) ];
            
            return y/2.0;

        }
    }
}