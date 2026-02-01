class Solution {
    public int minimumCost(int[] nums) {
    int sum=0;

    int min=Integer.MAX_VALUE;
    int second=Integer.MAX_VALUE;

    for(int i=1;i<nums.length;i++)
    {
if(min>nums[i]){
    second=min;
    min=nums[i];
}
else if( second>nums[i]){
    second=nums[i];
}
     


    }

    sum=min+second+nums[0];

    return sum;



    }
}