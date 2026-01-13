class Solution {
    public boolean checkXMatrix(int[][] g) {
        int  r=g.length;
        int c=g[0].length;

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j || i+j== r-1)
                {
                    if(g[i][j] == 0)
                    {
                        return false;
                    }
                }
                else{
                    if(g[i][j]!=0) return false;
                }
            }
        }

        return true;
    }
}