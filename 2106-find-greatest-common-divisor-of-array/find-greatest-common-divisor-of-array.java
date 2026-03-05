class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=0;
        
    for(int n:nums)
    {
        min=Math.min(min,n);
        max=Math.max(max,n);
    }
    int a=min;
    int b=max; 
while(b!=0)
{
    int temp=b;
    b=a%b;
    a=temp;
}

return a;

    }
}