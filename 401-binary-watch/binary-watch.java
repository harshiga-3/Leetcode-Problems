class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
      int t=0;
List<String>l=new ArrayList<>();
      for(int i=0;i<12;i++)
      {
        for(int j=0;j<60;j++)
        {
            t=Integer.bitCount(i)+Integer.bitCount(j);
            if(t==turnedOn)
            {
                l.add(i+":"+String.format("%02d",j));
            }
        }
      }

      return l;  
    }
}