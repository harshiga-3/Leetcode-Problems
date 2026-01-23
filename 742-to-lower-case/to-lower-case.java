class Solution {
    public String toLowerCase(String s) {
      StringBuilder a=new StringBuilder();  
        for(int i=0;i<s.length();i++)
        {
             char ch=s.charAt(i);
            if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {

               
                a.append((char)(ch+32));
            }
            else{
                a.append(ch);
            }
        }
        return new String(a);
    }
}