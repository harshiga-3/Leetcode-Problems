class Solution {
    public int[][] reverseSubmatrix(int[][] g, int x, int y, int k) {
        int top=x;
        int bottom=x+k-1;
        while(top<bottom)
        {
            for(int j=y;j<y+k;j++)
            {
                int tem=g[top][j];
                g[top][j]=g[bottom][j];
                g[bottom][j]=tem;
            }
            top++;
            bottom--;
        }
        return g;
    }
}