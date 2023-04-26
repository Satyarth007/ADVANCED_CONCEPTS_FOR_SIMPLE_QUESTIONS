class Solution {
    public int max(int i, int j , int[][] grid){
        
        return Math.max(grid[i-1][j-1],Math.max(grid[i-1][j],Math.max(grid[i-1][j+1],Math.max(grid[i][j-1],Math.max(grid[i][j],Math.max(grid[i][j+1],Math.max(grid[i+1][j-1],Math.max(grid[i+1][j],grid[i+1][j+1]))))))));
    }
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int maxLocal[][]=new int[n-2][n-2];
        for(int i =1;i<=n-2;i++){
            
            for(int j=1;j<=n-2;j++){
                maxLocal[i-1][j-1]= max(i,j,grid);
            }
        }

        return maxLocal;
    }
}
