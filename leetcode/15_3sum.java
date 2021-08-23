class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0)
            return result;
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++)
        {
            map.put(nums[i],i);
        }
        Set<String> used = new HashSet<>();
        
        for(int i=0;i<nums.length;i++)
        {            
            for(int j = i + 1;j<nums.length;j++)
            {
                int currSum = nums[i]+nums[j];
                if(map.containsKey(-1 * currSum))
                {
                    int k =  map.get(-1 * currSum);
                    if(!used.contains(nums[i] + ":" + nums[j] + ":" + nums[k]) && k>i && k>j)
                    {            
                        //-1 0 1 1
                        result.add(Arrays.asList(nums[i],nums[j], nums[k]));
                        used.add(nums[i] + ":" + nums[j] + ":" + nums[k]);// -1:-1:2
                    }
                }
            }
        }
        return result;
            
    }
}
