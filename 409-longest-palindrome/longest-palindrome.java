class Solution {
    public int longestPalindrome(String s) {
       int []freq=new int[128];

       for(char ch:s.toCharArray())
       {
        freq[ch]++;
       }

       int length=0;
       boolean odd=false;

       for(int c:freq)
       {
        if(c%2==0) {
            length+=c;
            }
        else {
            length+=c-1;
        odd=true;
        }
       }
       if(odd)
       {
        length+=1;
       }

       return length;
    }
}