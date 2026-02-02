class Solution {
    public int majorityElement(int[] nums) {
        //Moore's voting algo
        int majCount = 0;
        int majNumber = -1;
        for (int i = 0; i< nums.length; i++) {
            if (majCount == 0) {
                majNumber = nums[i];
                majCount = 1;
            } else if (majNumber == nums[i]) {
                majCount++;
            } else {
                majCount--;
            }
        }

        return majNumber;
    }
}