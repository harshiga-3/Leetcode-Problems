class Solution {
    public int lengthOfLastWord(String s) {
        int n=s.length()-1;

        char []a=s.toCharArray();
int i=n;int c=0;
        while(i>=0 && a[i]==' ')
        {
            i--;
        }

        while(i>=0 && a[i]!=' ')
        {
            i--;
            c++;
        }


        return c;
    }
}