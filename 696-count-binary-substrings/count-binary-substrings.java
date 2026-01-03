class Solution {
    public int countBinarySubstrings(String s) {
        int p=0;int c=1;
        int r=0;

        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1)){ c++;
            }
            else{
                p=c;
                c=1;
               
            }
            if(p>=c) r=r+1;
        }

        return r;
    }
}