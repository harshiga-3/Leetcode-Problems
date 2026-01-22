class Solution {
    public boolean canConstruct(String r, String m) {
        int []c=new int[26];

        for(int i=0;i<m.length();i++)
        {
            char ch=m.charAt(i);
            if(Character.isLowerCase(ch))
            {
                c[ch-'a']++;
            }
        }

        for(int j=0;j<r.length();j++)
        {
            char s=r.charAt(j);
            if(Character.isLowerCase(s))
            {
                if(c[s-'a']==0)return false;

                c[s-'a']--;
            }
        }
        return true;
    }
}