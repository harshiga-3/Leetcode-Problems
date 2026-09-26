class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer>s=new HashSet<>();
int max=0;
int count=0;
       for(int i=0;i<nums.length;i++)
       {
        s.add(nums[i]);
       } 

       for(int n:s)
       {

        if(!(s.contains(n-1)))
        {
int curr=n;
count=1;
while(s.contains(curr+1))
{
    curr++;
    count++;
}
max=Math.max(max,count);
        }

    
       }

       return max;
    }
}