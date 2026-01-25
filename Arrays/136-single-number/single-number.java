class Solution {
    public int singleNumber(int[] nums) {
        int xoredOutput = nums[0];
        for(int i = 1; i<nums.length;i++) {
            xoredOutput = xoredOutput ^ nums[i];
        }
        return xoredOutput;
    }
}