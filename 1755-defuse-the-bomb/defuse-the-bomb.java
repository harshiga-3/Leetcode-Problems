class Solution {
    public int[] decrypt(int[] code, int k) {
        int []r=new int[code.length];
int n=code.length;int sum;

        for(int i=0;i<code.length;i++)
        {
             sum=0;
            if(k==0) return r;
if(k>0)
{
    for(int j=1;j<=k;j++)
    {
        sum+=code[(i+j)%n];
    }
}
else{
    for(int j=1;j<=-k;j++)
    {
        sum+=code[(i-j+n)%n];
    }
}

r[i]=sum;

        }

        return r;
    }
}