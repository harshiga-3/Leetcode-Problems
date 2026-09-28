class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer,Integer>m=new HashMap<>();
int min=Integer.MAX_VALUE;
        for(int i=0;i<cards.length;i++)
        {
        if(m.containsKey(cards[i]))
        {
            int prev_Index=i-m.get(cards[i])+1;

            min=Math.min(min,prev_Index);
        }
        m.put(cards[i],i);
        }

        return min==Integer.MAX_VALUE?-1:min;
    }
}