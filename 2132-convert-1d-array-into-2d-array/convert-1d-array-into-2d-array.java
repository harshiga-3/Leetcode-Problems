class Solution {
    public int[][] construct2DArray(int[] o, int m, int n) {
        int p=0;
int [][]a=new int[m][n];
if(o.length != m*n) return new int[0][0];
        while(p<o.length)
        {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=o[p];
                p++;
            }
        }
        }
        return a;
    }
}