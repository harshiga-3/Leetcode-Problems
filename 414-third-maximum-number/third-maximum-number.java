class Solution {
    public int thirdMax(int[] nums) {
        Long first=null;
        Long second=null;
        Long third=null;
        for(int n:nums)
        {
            if(first != null && n==first) continue;
            if(second!=null && n==second) continue;
            if(third !=null && n==third) continue;
if(first==null || first<n)
{
    third=second;
    second=first;
    first=(long)n;
}
else if( second== null || (second<n && first>n))
{
    third=second;
    second=(long)n;
    
}
else if(third==null || (second>n && third<n)){ 
third=(long)n;

}
        }
        if(third==null) return first.intValue();

        return third.intValue();
    }
}