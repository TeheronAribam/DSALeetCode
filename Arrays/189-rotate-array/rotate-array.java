class Solution {
    public void rotate(int[] nums, int k) {
        // int[] copyNums = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        //     int newPos = (i + k) % nums.length;
        //     copyNums[newPos] = nums[i];
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] = copyNums[i];
        // }
        k = k % nums.length;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public static void reverse(int[] nums, int left, int right) {
        while(left<right) {
            nums[left] = nums[left] + nums[right];
            nums[right] = nums[left] - nums[right];
            nums[left] = nums[left] - nums[right];
            left++;
            right--;
        }
    }
}