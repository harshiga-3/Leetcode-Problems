class Solution {
    public boolean isValid(String word) {
        int vowel=0;
        int con=0;
        int digit=0;int c=0;

        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'|| ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowel++;
                c++;
            }
            else if( (ch>=65 && ch<=90) || (ch>=97 && ch<=122))
            {
                con++;
                c++;
            } 
            else if(ch>=48 && ch<=57)
            {
                digit++;
                c++;
            }
            else{
                return false;
            }
        }

        if( c>=3 && ( vowel>0 && con>0 )) return true;

        return false;
    }
}