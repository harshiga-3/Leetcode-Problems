class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        int [][]a=new int [r][c];   
        int index=0;

        if(row * col !=  r*c) return mat;
        for(int i=0;i<row;i++)
        {
            
            
            for(int j=0;j<col;j++)
            {
                a[index/c][index%c]=mat[i][j];
                index++;
            }
        
        }

return a;

         }
}