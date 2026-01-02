class Solution {
    public void rotate(int[] nums, int k) {
        int[] copyNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int newPos = (i + k) % nums.length;
            copyNums[newPos] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = copyNums[i];
        }
    }
}