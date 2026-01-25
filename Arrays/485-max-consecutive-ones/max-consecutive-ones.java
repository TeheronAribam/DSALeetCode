class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr1s = 0;
        int max1s = curr1s;
        for (int i = 0; i<nums.length; i++) {
            if(nums[i] == 1) {
                curr1s++;
            }
            if(nums[i] == 0) {
                max1s = Math.max(max1s, curr1s);
                curr1s = 0;
            }
        }
        return Math.max(max1s, curr1s);
    }
}