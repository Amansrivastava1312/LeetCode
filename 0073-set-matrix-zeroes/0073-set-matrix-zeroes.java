class Solution {
    public void setZeroes(int[][] matrix) {
//          int m = matrix.length;
//         int n= matrix[0].length;
//         int matrix2[][]= new int[m][n];
//         for(int i =0;i<matrix.length;i++){
//             for(int j =0 ;j<matrix[0].length;j++){
//                matrix2[i][j]=matrix[i][j];
//                 }
//             }

//              for(int k =0;k<matrix.length;k++){
//             for(int l=0 ;l<matrix[0].length;l++){
//                     if(matrix[k][l]==0){

//                         for(int o=0;o<m;o++){
//                             matrix2[o][l]=0;
//                         }
//                          for(int p=0;p<n;p++){
//                             matrix2[k][p]=0;
//                         }
//                     }

//             }
//             }




//          for(int s =0;s<m;s++){
//             for(int q =0 ;q<n;q++){
//                matrix[s][q]=matrix2[s][q];
//                 }
//             } 
    
    
        
    
    
    
    
        int n = matrix.length;
        int m= matrix[0].length;
        int col0=1;
        for(int i =0 ; i<n;i++){
            for(int j=0 ; j<m;j++){
                if(matrix[i][j]==0){
                    // mark ith row 
                    matrix[i][0]=0;
                    // mark ith column
                    if (j!=0)
                        matrix[0][j]=0;
                    else
                        col0=0;
                    
                }
            }
        }
        
        for(int i=1;i<n;i++){
            for(int j =1;j<m;j++){
                if(matrix[i][j] !=0){
                    if( matrix[0][j]==0 || matrix[i][0]==0){
                            matrix[i][j]=0;
                }
                }
                
            }
        }
        
        if(matrix[0][0]==0){
            for(int i=0;i<m;i++) matrix[0][i]=0;
        }
        
        if(col0==0){
            for(int j=0;j<n;j++) matrix[j][0]=0;
        }
        
        
    }
}