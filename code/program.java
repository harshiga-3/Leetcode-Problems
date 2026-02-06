class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int n:nums)
        {
            sum+=n;
        }
int left=0;int c=0;
        for(int i=0;i<nums.length-1;i++){
left+=nums[i];
int right=sum-left;

int diff=Math.abs(left-right);

if(diff%2==0) c++;
        }

        return c;
    }
}