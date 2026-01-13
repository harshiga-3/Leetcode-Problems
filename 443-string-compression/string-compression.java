class Solution {
    public int compress(char[] chars) {
     int idx=0;
     int count;
int i=0;
     while(i<chars.length)
     {
        char c=chars[i];
        count=0;
        while(i<chars.length && c==chars[i])

        {
            i++;
            count++;
        }
        chars[idx++]=c;

        if(count>1)
        {
            String num=Integer.toString(count);

            for(char ch:num.toCharArray())
            {
                chars[idx++]=ch;
            }
        }


     }

     return idx;

    }
}