class Solution {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);
        // return;

        int left = 0;
        int right = nums.length - 1;
        int i =0;

        while (i <= right) {
            int temp;
            if (nums[i] == 0) {
                //swap i and left
                temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else if (nums[i] == 2) {
                //swap i and right
                temp = nums[right];
                nums[right] = nums[i];
                nums[i] = temp;
                right--;
            }
        }
    }
}