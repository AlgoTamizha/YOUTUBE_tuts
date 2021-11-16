class Solution {
    public void moveZeroes(int[] nums) {
        
        int start = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!= 0)
            {
                nums[start] = nums[i];
                start++;
            }
        }
        
        for(int i = start;i<nums.length;i++)
            nums[i] = 0;
        
    }
}

/*
[1,3,12,3,12]
        |
 

loop 1 -> non zero front


loop 2 -> back add 0
*/
