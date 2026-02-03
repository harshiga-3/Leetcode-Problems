class Solution {
    public boolean isTrionic(int[] nums) {
        int i=0;int n=nums.length;
        while(i+1<n && nums[i]<nums[i+1])
        {
            i++;
        }
        if(i==0) return false;

        int p=i;

        while(i+1 < n && nums[i]>nums[i+1] )
        {
            i++;
        }
        if(p==i) return false;

        int e=i;

        while(i+1<n && nums[i]<nums[i+1])
        {
            i++;
        }

        if(e==i) return false;


        return i==n-1;

    }
}