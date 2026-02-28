class Solution {
    public int titleToNumber(String c) {
        int r=0;
      for(int i=0;i<c.length();i++)
      {
char ch=c.charAt(i);
r=r*26+(ch-'A'+1);
      }  
      return r;
    }
}