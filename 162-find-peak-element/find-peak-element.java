class Solution {
    public int findPeakElement(int[] nums) {
        int index=-1;
        int n=nums.length-1;
        if(nums.length==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n]>nums[n-1]) return n;
        for(int i=1;i<nums.length-1;i++)
        {
            if(nums[i-1]<nums[i] && nums[i+1]<nums[i])
            {
                index=i;
            }
        }

        return index;
    }
}