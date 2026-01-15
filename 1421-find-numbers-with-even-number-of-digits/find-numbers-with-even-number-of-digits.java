class Solution {
    public int findNumbers(int[] nums) {
      int c=0;
int d;int i=0;

      while(i<nums.length)
      {
        d=0;
        while(nums[i]>0)
        {
            int r=nums[i]%10;
            d++;
            nums[i]/=10;
        }
        i++;
        if(d%2==0)
        {
            c++;
        }
      }  

      return c;
    }
}