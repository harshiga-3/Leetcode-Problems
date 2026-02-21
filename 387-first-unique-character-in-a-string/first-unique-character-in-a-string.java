class Solution {
    public int firstUniqChar(String s) {
        int []a=new int[26];int idx=0;boolean flag=false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            a[ch -'a']++;
        }
        for(int j=0;j<s.length();j++)
        {
            char c=s.charAt(j);
            if(a[c-'a']==1)
            {
                idx=j;
                flag=true;
                break;
            }
        }
        if(flag) return idx;
        else  return -1;
    }
}