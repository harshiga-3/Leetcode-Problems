class Solution {
    public int[] sortArrayByParityII(int[] nums) {
   int odd=1;
   int even=0;
int n=nums.length;
   while(odd<n && even<n)
   {
    if(nums[even]%2==0)
    {
        even+=2;
    }
    else if(nums[odd]%2==1)
    {
        odd+=2;
    }

    else{
int t=nums[even];
nums[even]=nums[odd];
nums[odd]=t;
odd+=2;
even+=2;
    }


   }

return nums;


    }
}