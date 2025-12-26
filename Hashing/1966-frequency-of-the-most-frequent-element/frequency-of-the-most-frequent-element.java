class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        long total = 0;   // use long to avoid overflow
        int left = 0;
        int maxFreq = 1;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];

            // While cost to make all values equal to nums[right] exceeds k, shrink window
            while ((long) nums[right] * (right - left + 1) - total > k) {
                total -= nums[left];
                left++;
            }

            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }
}