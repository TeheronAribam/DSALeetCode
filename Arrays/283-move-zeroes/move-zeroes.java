class Solution {
    public void moveZeroes(int[] nums) {
        int j=0, i=0;
        while (i<nums.length) {
            if (nums[i]!=0  && nums[j]!=0) {
                i++;
                j++;
            } else if (nums[i]==0) {
                i++;
            } else if (nums[i] != 0 && i!=j) {
                //swap i and j
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                i++;
            }
        }
    }
}