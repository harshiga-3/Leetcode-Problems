class Solution {
    public int[] countBits(int n) {
        int []a=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int num=i;
            int c=0;

            while(num>0)
            {
                if(num%2==1)
                {
                    c++;
                }
                num/=2;
            }

            a[i]=c;
        }

        return a;
    }
}