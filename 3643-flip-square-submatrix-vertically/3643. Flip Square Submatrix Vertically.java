class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int rowlength=grid.length;
        int columnlength=grid[0].length;
        int[][] grid2=new int[k][k];
        int p=0,q=0;
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
            {             
                grid2[i][j]=grid[i+x][j+y];   
            }
        }
        int[][] temp=new int[k][k];
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
            {
                temp[i][j]=grid2[k-i-1][j];
            }
        }
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<k;j++)
            {
                grid[i+x][j+y]=temp[i][j];
            }
        }
        return grid;
    }
}