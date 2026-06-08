class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       int countless=0;
       int countequal=0;
int []ans=new int[nums.length];
       for(int n:nums)
       {
        if(n<pivot) countless++;
        else if(n==pivot) countequal++;
       } 

       int first=0;
       int equal=countless;
       int greater=countless+countequal;

       for(int q:nums)
       {
        if(q<pivot){ ans[first++]=q;
        }
        else if(q==pivot){
            ans[equal++]=q;
            
        }
        else if(q>pivot){
ans[greater++]=q;

        }
       }

       return ans;
    }
}