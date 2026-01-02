class Solution {
    public int removeDuplicates(int[] nums) {
        // int k = 1;
        // ArrayList<Integer> numsNew = new ArrayList<>();
        // numsNew.add(nums[0]);
        // for (int i=1; i<nums.length; i++) {
        //     if (nums[i] > nums[i-1]) {
        //         numsNew.add(nums[i]);
        //         k++;
        //     }
        // }
        // for (int i=0; i<k;i++) {
        //     nums[i] = numsNew.get(i);
        // }
        // return k;

        int k = 1;
        int lastPointer = 0;

        for (int i = 1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {

            } else {
                k++;
                nums[++lastPointer] = nums[i];
            }
        }
        return k;
    }
}