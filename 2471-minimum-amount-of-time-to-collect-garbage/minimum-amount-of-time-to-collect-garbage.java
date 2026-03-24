class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int lastM=0;int total=0;
        int lastP=0;
        int lastG=0;

        for(int i=0;i<garbage.length;i++)
        {
            total+=garbage[i].length();
            for(char c:garbage[i].toCharArray())
            {
                if(c=='G')lastG=i;
                if(c=='P')lastP=i;
                if(c=='M')lastM=i;
            }
        }
        int []prefix=new int[garbage.length];

        prefix[0]=0;
        for(int i=1;i<garbage.length;i++)
        {
            prefix[i]=prefix[i-1]+travel[i-1];
        }
        total+=prefix[lastG];
        total+=prefix[lastM];
        total+=prefix[lastP];

        return total;
    }
}