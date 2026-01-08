class Solution {
    public int maxVowels(String s, int k) {

        char []a=s.toCharArray();
        int c=0;int max=-1;
        for(int i=0;i<k;i++)
        {
            char ch=a[i];
           if(isvowel(ch))
           {
            c++;
           } 
            
        }

max=c;
        for(int i=k;i<a.length;i++)
        {
            char ch=a[i];

if(isvowel(ch))
           {
            c++;
           } 
char f=a[i-k];
           if(isvowel(f))
           {
            c--;
           }

           max=Math.max(max,c);
        }

return max;
    }

    public boolean isvowel(char c)
    {
        return c=='a' || c=='e' ||c=='i' || c=='o' || c=='u';
    }
}


 