class Solution {
    public int mostWordsFound(String[] sentences) {
        int count;int m=0;
        for(String s:sentences)
        {
count=1;
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
{
    count++;
}
}
m=Math.max(count,m);
        }

        return m;

    
    }
}