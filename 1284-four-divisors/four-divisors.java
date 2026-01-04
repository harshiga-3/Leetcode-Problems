class Solution {
    public int sumFourDivisors(int[] nums) {
        int c;int j;int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int ch=nums[i];c=2;
            j=2;int sum=0;
            while(j<ch)
            {
                if(ch%j==0)
                {
                    sum=sum+j;
                    c++;
                    if(c>4)break;
                }
                j++;
            }
            if(c==4)
            {
                sum=sum+1+ch;
                ans+=sum;
            }
        }
        return ans;
    }
}