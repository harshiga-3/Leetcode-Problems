class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int []b=new int[46];
int max=0;
        for(int i=lowLimit;i<=highLimit;i++)
        {
            int ans=fun(i);
            b[ans]++;
            max=Math.max(max,b[ans]);
        }

       
        return max;
    }

     public int fun(int digit)
        {
            int sum=0;
            while(digit>0)
            {
                int rem=digit%10;
                sum+=rem;
                digit/=10;
            }
            return sum;
        }

}