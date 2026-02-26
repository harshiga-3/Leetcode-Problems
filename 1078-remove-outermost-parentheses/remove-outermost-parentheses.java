class Solution {
    public String removeOuterParentheses(String s) {
       String m="";
int depth=0;
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        if(ch=='('){
        if(depth>0)
        {
            m+=ch;
           
        }
        depth++;
        }
        else{
            depth--;
            if(depth>0)
            {
                m+=ch;
            }
        }

       }

       return m;
    }

}
        
       
    
