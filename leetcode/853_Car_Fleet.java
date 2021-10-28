class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
      
     
    int fleets = position.length;
    Map<Integer, Float > map = new HashMap<>();
        
        
    for(int i=0;i<position.length;i++)
    {
     float time = ((float)target -  position[i]) / speed[i];
     map.put(position[i],time);
    }
    Arrays.sort(position);
    int i = position.length - 1;
    while(i > 0)
    {
      float c= map.get(position[i]);
      i--;
      while(i >=0 && c >= (float)map.get(position[i]))
      {
          fleets--;
          i--;
      }
       
    }
        return fleets;
    }
}
//time O(NlogN)
//space( O(N))
