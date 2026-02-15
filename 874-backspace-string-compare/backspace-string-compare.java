class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>s1=new Stack<>();
        Stack<Character>s2=new Stack<>();

        int i=0;
        int j=0;

    while(i<s.length())
    {
        if(s.charAt(i)!='#')
        {
            s1.push(s.charAt(i));
        }
        else{
            if(!s1.isEmpty()){
            s1.pop();
            }
        }
        i++;
    }

    while(j<t.length()){

        if(t.charAt(j)!='#')
        {
            s2.push(t.charAt(j));
        }
        else{

            if(!s2.isEmpty()){
            s2.pop();
            }
        }
       
        j++;
    }
return s1.equals(s2);
    
    }
}