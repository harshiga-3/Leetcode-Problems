class Solution {
    public String convertToTitle(int c) {
       StringBuilder s=new StringBuilder();

       while(c>0)
       {
        c--;
        int rem=c%26;
        char ch= (char)('A'+rem);
        s.append(ch);
        c=c/26;

       } 

       return s.reverse().toString();
    }
}