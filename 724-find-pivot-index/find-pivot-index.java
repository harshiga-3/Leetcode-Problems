class Solution {
    public int pivotIndex(int[] nums) {

        int l;
        int r;
        int s,sum;

        for(int j=0;j<nums.length;j++)
        {
            l=0;
            r=j+1;
            sum=0;
            s=0;
        while(r<nums.length )
        {
            sum=sum+nums[r];
            r++;
           

        }

        while(l<j && j!=0)
        {
            s+=nums[l];
            l++;
        }
        if(sum==s) return j;

        }

        return -1;
    }
}