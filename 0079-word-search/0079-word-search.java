class Solution {
    
    boolean wordSearch(char[][] board , String word , int i , int j , int m, int n,int k){
        if(word.length()== k)
            return true;
        if(i<0 || j<0 || i>=m|| j>=n || board[i][j]!=word.charAt(k)) return false;
        
        char ch = board[i][j];
        board[i][j]='#';
        
       boolean op1= wordSearch(board , word , i +1,j,m,n,k+1);
         boolean op2= wordSearch(board , word , i -1,j,m,n,k+1);
         boolean op3= wordSearch(board , word , i ,j+1,m,n,k+1);
       boolean op4=  wordSearch(board , word , i ,j-1,m,n,k+1);
         board[i][j]=ch;
        return op1|| op2 || op3 || op4 ;
        
    }
    public boolean exist(char[][] board, String word) {
        
        for(int i=0;i<board.length;i++){
            for(int j =0;j<board[0].length;j++){
                if(board[i][j]== word.charAt(0))
                    if(wordSearch(board,word,i,j,board.length,board[0].length,0))
                        return true;
            }
            
        }
        return false;
    }
}