class Solution {
    public int[] shuffle(int[] nums, int n) {
      int l=0;int i=0;
      int r=n;
      int []a=new int[nums.length];
      while(l<n && r<nums.length)
      {
a[i++]=nums[l];l++;
a[i++]=nums[r];r++;
      }  
      return a;
    }
}