public class Solution {
    public int hammingWeight(int n) {
        int ones = 0;
        for(int i = 1;i <= 32;i++)
        {
            ones += n & 1;
            n = n >> 1;
        }
        return ones;
    }
}
