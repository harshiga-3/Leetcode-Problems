class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
List<List<Integer>>l=new ArrayList<>();
int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            int diff=Math.abs(arr[i]-arr[i+1]);
            if(diff<min)
            {
                min=diff;
                l.clear();
                l.add(Arrays.asList(arr[i],arr[i+1]));

                
            }
            else if(diff==min)
            {
                l.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }

        return l;
    }
}