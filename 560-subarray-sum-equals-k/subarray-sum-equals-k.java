class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer>m=new HashMap<>();
int c=0;
int sum=0;
m.put(0,1);
for(int i=0;i<nums.length;i++)
{
sum+=nums[i];
int diff=sum-k;
if(m.containsKey(diff))
{
    c+=m.get(diff);
   
}

m.put(sum,m.getOrDefault(sum,0)+1);

}
return c;

    }
}