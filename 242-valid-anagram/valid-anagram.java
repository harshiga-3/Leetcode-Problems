class Solution {
    public boolean isAnagram(String s, String t) {
        int []f=new int[26];

        for(char c:s.toCharArray())
        {
            f[c-'a']++;
        }
        for(char ch:t.toCharArray())
        {
            f[ch-'a']--;
        }

        for(int c:f)
        {
            if(c!=0)
              return false;
        }

        return true;
    }
}