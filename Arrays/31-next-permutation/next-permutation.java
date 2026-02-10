class Solution {
    public void nextPermutation(int[] nums) {
        int flipIndex = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                flipIndex = i;
                break;
            }
        }
        if (flipIndex == -1) {
            reverse(nums, 0, nums.length-1);
            return;
        }

        int swapIndex = nums.length-1;
        for (int i = nums.length - 1; i > flipIndex; i--) {
            if (nums[flipIndex] < nums[i]) {
                swapIndex = i;
                break;
            }
        }

        //swap flipIndex and swapindex
        nums[flipIndex] = nums[flipIndex] + nums[swapIndex];
        nums[swapIndex] = nums[flipIndex] - nums[swapIndex];
        nums[flipIndex] = nums[flipIndex] - nums[swapIndex];

        reverse(nums, flipIndex + 1, nums.length-1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}