class Solution {
    public String removeDuplicates(String ss) {
    Stack<Character>s=new Stack<>();
StringBuilder r=new StringBuilder();
    for(char ch:ss.toCharArray()) 
    {
        if(!s.isEmpty() && s.peek()==ch)
        {
            s.pop();
        }else{
            s.push(ch);
        }
    }

    for(char c:s)
    {
r.append(c);
    } 

    return r.toString();
    }
}