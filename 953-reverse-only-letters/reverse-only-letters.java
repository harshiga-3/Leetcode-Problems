class Solution {
    public String reverseOnlyLetters(String s) {
         int r=s.length()-1;
        char []a=s.toCharArray();

        int l=0;
       

        while(l<r)
        {
             if(!((a[l]>=65 && a[l]<=90) ||(a[l]>=97 && a[l]<=122)) ){ l++;}

            else if(!((a[r]>=65 && a[r]<=90) ||(a[r]>=97 && a[r]<=122)) ) {r--;}
            else{
                char t=a[l];
                a[l]=a[r];
                a[r]=t;
                l++;r--;
            }



        }

        return  new String(a);
    }
}