class Solution {
    public String finalString(String s) {
      char []a=new char[s.length()];
int len=0;
      for(int i=0;i<s.length();i++)
      {
        char c=s.charAt(i);
        if(c=='i')
        {
            int l=0;int r=len-1;
while(l<r)
{
char t=a[l];
a[l]=a[r];
a[r]=t;
l++;r--;
}
        }
        else{
            a[len]=c;
            len++;
        }
      }

      return new String(a,0,len);

    }
}