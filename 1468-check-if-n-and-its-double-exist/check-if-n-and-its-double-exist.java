class Solution {
    public boolean checkIfExist(int[] arr) {
        int j;
        for(int i=0;i<arr.length;i++)
        {
            j=0;
            while(j<arr.length)
            {
                if(i!=j && arr[i]==arr[j]*2 )
                {
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}