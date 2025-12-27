class Solution {
    public int findGCD(int[] nums) {
        int smallest = nums[0], largest = nums[0];
        for (int i=1;i<nums.length;i++) {
            if (nums[i] > largest) {
                largest = nums[i]; 
            }
            if (nums[i] < smallest) {
                smallest = nums[i];
            }
        }

        return this.getGCD(largest, smallest);
    }

    private int getGCD(int n1, int n2) {
        int max = Math.max(n1, n2);
        int min = Math.min(n1, n2);
        if (min == 0) {
            return max;
        }

        return this.getGCD(max-min, min);
    }
}