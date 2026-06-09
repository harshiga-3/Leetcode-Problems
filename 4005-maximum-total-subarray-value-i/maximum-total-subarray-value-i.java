class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max=nums[0];
        int min=nums[0];

        for(int n:nums)
        {
            max=Math.max(n,max);
            min=Math.min(n,min);
        }
        return 1L*k*(max-min);
    }
}