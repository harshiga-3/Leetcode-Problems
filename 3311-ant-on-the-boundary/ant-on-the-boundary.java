class Solution {
    public int returnToBoundaryCount(int[] nums) {
        
        int c=0;
        int p=0;
        for(int n:nums)
        {
            p+=n;
            if(p==0)
            {
                c++;
            }
        }

        return c;
    }
}