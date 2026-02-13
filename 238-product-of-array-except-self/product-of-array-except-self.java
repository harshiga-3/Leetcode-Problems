class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix=1;
        int suffix=1;
int n=nums.length;
        int []ans=new int[n];

        for(int i=0;i<n;i++)
        {
            ans[i]=prefix;
            prefix*=nums[i];
        }
        for(int j=n-1;j>=0;j--)
        {
            ans[j]*=suffix;
            suffix*=nums[j];
        }

        return ans;
    }
}