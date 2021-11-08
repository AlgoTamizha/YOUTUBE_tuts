class Solution {
    public int singleNumber(int[] nums) {
        
        int result = 0;
        
        for(int num : nums)
        {
            result = result ^ num;
        }
        
        return result;
      
    }
}

//time O(N)
//space O(1)
