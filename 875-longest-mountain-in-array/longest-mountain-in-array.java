class Solution {
    public int longestMountain(int[] arr) {
       int left=0;
       int right=0; int max=0;
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                left =i-1;
                right=i+1;

                while(left >0 && arr[left-1]<arr[left]){
                     left--;
                }
                while(right<arr.length-1 && arr[right] >arr[right+1]){
                    right++;
                }

                int long_val=right-left+1;

                if(max<long_val){
                    max=long_val;
                }
            }
        }

        return max;
    }
}