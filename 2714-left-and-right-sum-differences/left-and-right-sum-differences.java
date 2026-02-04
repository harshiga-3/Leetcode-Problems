class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
int left=0;
        for(int i=0;i<nums.length;i++)
        {
int right=sum-left-nums[i];



int diff=Math.abs(left-right);
left+=nums[i];

nums[i]=diff;
        }

        return nums;
    }
}