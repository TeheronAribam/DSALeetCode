class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        // int size = nums.length;
        // int windowSize = size;
        // int cost = 0;

        // while(windowSize > 0) {
        //     for (int i = size-1; i>=windowSize-1 ; i--) {
        //         int windowSum = 0;
        //         for(int j=i-1; j>i-windowSize; j--) {
        //             windowSum+=nums[j];
        //         }
        //         cost = nums[i]*(windowSize-1) - windowSum;
        //         if (cost <= k) {
        //             return windowSize;
        //         }
        //     }
        //     windowSize--;
        // }

        // return windowSize;

        int left = 0;
        int freq = 1;
        long windowSum=0;

        for (int right = 0; right<nums.length; right++) {
            windowSum+=nums[right];
            int windowSize = right - left + 1;
            long cost = (long)nums[right] * windowSize - windowSum;

            while (cost > k) {
                windowSum = windowSum - nums[left++];
                windowSize = right - left + 1;
                cost = nums[right] * windowSize - windowSum;
            }

            freq = Math.max(freq, windowSize);
        }

        return freq;
    }
}