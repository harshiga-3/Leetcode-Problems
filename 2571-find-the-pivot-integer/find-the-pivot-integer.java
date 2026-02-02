class Solution {
    public int pivotInteger(int n) {
        int sum=0;int right=0;
      for(int c=1;c<=n;c++)
      {
        sum+=c;
      } 


      for(int i=n;i>=1;i--)
      {
        right+=i;
        
        if(sum ==right)
        {
return i;
        }
        sum-=i;
    

      }

      return -1; 
    }
}