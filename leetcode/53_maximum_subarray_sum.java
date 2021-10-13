class Solution {
    public int maxSubArray(int[] nums) {
      int sum =0 ;
      int max = Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++)
        max=Math.max(max,nums[i]);
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i] + sum < 0)
        {
          sum=0;
          continue;
        }
        else
        {
          sum+=nums[i];
          max=Math.max(sum,max);
        }
      }
      return max;
        
    }
}


//time O(N)
//space O(1)
