class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int []r=new int[nums.length];
int index=0;
int n=nums.length;
        for(int i=0;i<n;i++)
        {
            
                index=(i+nums[i]%n+n)%n;
            

            r[i]=nums[index];
        }

        return r;
    }
}