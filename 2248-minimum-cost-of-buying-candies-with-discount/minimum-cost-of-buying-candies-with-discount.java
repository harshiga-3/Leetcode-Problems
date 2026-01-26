class Solution {
    public int minimumCost(int[] arr) {
        Arrays.sort(arr);
        int min=0;int c=0;
for(int i=arr.length-1;i>=0;i--)
{
c++;
if(c%3!=0)
{
    min+=arr[i];
}
}

return min;

    }
}