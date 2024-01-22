class Solution {
    void flood(int[][] image, int oldColor , int newColor , int m , int n , int sr , int sc ){
        
        if(sr >= m || sc >=n || sr < 0 || sc<0 || image[sr][sc]!=oldColor) return;
        
        image[sr][sc]= newColor;
        flood(image, oldColor , newColor , m , n , sr+1,sc);
        flood(image, oldColor , newColor , m , n , sr-1,sc);
        flood(image, oldColor , newColor , m , n , sr,sc+1);
        flood(image, oldColor , newColor , m , n , sr,sc-1);
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if(oldColor==color) return image;
        int m = image.length;
        int n = image[0].length;
        flood(image, oldColor , color , m , n , sr,sc);
        return image;
    }
}