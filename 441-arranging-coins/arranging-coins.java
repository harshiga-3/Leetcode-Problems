class Solution {
    public int arrangeCoins(int n) {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n>=i)
            {
                n-=i;
                c++;
            }
            else{
                break;
            }
        }

        return c;
    }
}