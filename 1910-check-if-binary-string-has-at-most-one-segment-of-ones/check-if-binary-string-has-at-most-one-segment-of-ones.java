class Solution {
    public boolean checkOnesSegment(String s) {
        boolean c=false;

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='0'){
                c=true;
            }
            if(ch=='1' && c)
            {
                return false;
            }
        }
        return true;

    }
}