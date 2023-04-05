class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n= matrix[0].length;
        int matrix2[][]= new int[m][n];
        for(int i =0;i<matrix.length;i++){
            for(int j =0 ;j<matrix[0].length;j++){
               matrix2[i][j]=matrix[i][j];
                }
            }

             for(int k =0;k<matrix.length;k++){
            for(int l=0 ;l<matrix[0].length;l++){
                    if(matrix[k][l]==0){

                        for(int o=0;o<m;o++){
                            matrix2[o][l]=0;
                        }
                         for(int p=0;p<n;p++){
                            matrix2[k][p]=0;
                        }
                    }

            }
            }




         for(int s =0;s<m;s++){
            for(int q =0 ;q<n;q++){
               matrix[s][q]=matrix2[s][q];
                }
            }
    }
}