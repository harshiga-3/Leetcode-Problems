class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int mis=0;
        int rep=0;
        int []c=new int[row*row+1];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
c[grid[i][j]]++;
            }
        }
        for(int p=1;p<=row*row;p++)
        {
            if(c[p]==0)
            {
                mis=p;
            }
            if(c[p]==2)
            {
                rep=p;
            }
        }


        return new int[]{rep,mis};
    }
}