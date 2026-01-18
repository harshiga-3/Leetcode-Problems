class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer>m=new HashMap<>();

        Stack<Integer>s=new Stack<>();

        for(int n:nums2)
        {
while(!s.isEmpty() &&  n>s.peek())
{
    int small=s.pop();
    m.put(small,n);
}
s.push(n);
        }
        while(!s.isEmpty())
        {
            m.put(s.pop(),-1);
        }
    int []a=new int[nums1.length];
    for(int i=0;i<nums1.length;i++)
    {
        a[i]=m.get(nums1[i]);
    }

    return a;
    }
}