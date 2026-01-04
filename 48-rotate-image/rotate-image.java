class Solution {
    public void rotate(int[][] matrix) {
       int r=matrix.length;
       int c=matrix[0].length;

       for(int i=0;i<r;i++)
       {
        for(int j=i+1;j<c;j++)
        {
            int t=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=t;
        }
       } 
       for(int i=0;i<r;i++)
       {
        int l=0;int e=c-1;
        while(l<e)
        {
            int t=matrix[i][l];
            matrix[i][l]=matrix[i][e];
            matrix[i][e]=t;
            l++;
            e--;

        }
       }
       
    }
}