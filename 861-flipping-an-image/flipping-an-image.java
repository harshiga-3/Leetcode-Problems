class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r=image.length;
        int c=image[0].length;
        int [][]a=new int[r][c];


        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=image[i][c-1-j]^1;

               
            }
        }

        return a;
    }
}