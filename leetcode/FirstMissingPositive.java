class Solution {
    public int firstMissingPositive(int[] nums) {
        
      for(int i =0;i<nums.length;i++)
      {
          if(nums[i] < 0) nums[i] = 0;
      }
        
      for(int i =0;i<nums.length;i++)
      {
          int curr = Math.abs(nums[i]);
          if(curr < 1 || curr > nums.length)
              continue;
          if(nums[curr - 1] == 0)
              nums[curr - 1] = Integer.MIN_VALUE;
          else if(nums[curr-1] > 0)
              nums[curr - 1] *= -1;
           
      }
     for(int i =1;i<=nums.length;i++)//[-1,-2,-3,-4] -> 5
     {
         if(nums[i-1] >= 0)
             return i;
     }
        return nums.length + 1;
        
        
       
    }
}
