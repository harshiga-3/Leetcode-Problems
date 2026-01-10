class Solution {
    public int minStartValue(int[] nums) {
int m=0;
int sum=0;
       for(int n:nums)
       {
        sum+=n;
        m=Math.min(sum,m);
       } 
       return 1- m;
    }
}