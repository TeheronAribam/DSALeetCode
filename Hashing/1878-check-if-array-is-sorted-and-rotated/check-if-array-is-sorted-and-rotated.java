class Solution {
    public boolean check(int[] nums) {
        // boolean sorted = true;
        // int smallestChain1 = nums[0];
        // int largestChain2 = nums[nums.length-1];
        // int flips = 0;
        // for(int i = 1; i < nums.length; i++) {
        //     if(nums[i] < nums[i-1]) {
        //         sorted = false;
        //         flips++;
        //     }
        // }
        // return sorted ? true : flips > 1 ? false : smallestChain1 >= largestChain2;

        int count = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] > nums[(i+1) % nums.length]) {
                count++;
            }
            if(count>1) {
                return false;
            }
        }
        return true;
    }
}