class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n=nums.size();
        int m=Integer.MAX_VALUE;
      int []prefix=new int[n+1];
       prefix[0]=0;

      for(int i=0;i<n;i++)
      {
        prefix[i+1]=prefix[i]+nums.get(i);
      }  

      for(int start=0;start<n;start++)
      {
        for(int end=l;end<=r;end++)
        {
            int len=(start+end)-1;
if(len>=n) break;
            int diff=prefix[len+1]-prefix[start];

            if(diff>0)
            {
                m=Math.min(m,diff);
            }


        }
      }

      return m==Integer.MAX_VALUE?-1:m;
    }
}