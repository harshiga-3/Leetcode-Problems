class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=nums[n-1];
        if(max+1!=n)
        {
            return false;
        }

        for(int i=0;i<max-1;i++)
        {
            if(nums[i]!=i+1)
            {
                return false;
            }
        }

        if(nums[n-1]!=nums[n-2]) return false;

        return true;
        
    }
}