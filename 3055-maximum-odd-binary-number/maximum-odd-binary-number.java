class Solution {
    public String maximumOddBinaryNumber(String s) {
      int ones=0;
      StringBuilder sb=new StringBuilder();
     
      for(char n:s.toCharArray()){
if(n=='1') ones++;
      } 
       int zero=s.length()-ones; 

      for(int i=0;i<ones-1;i++){
        sb.append('1');
      }
      for(int i=0;i<zero;i++)
      {
        sb.append('0');
      }
      sb.append('1');

      return sb.toString();
    }
}