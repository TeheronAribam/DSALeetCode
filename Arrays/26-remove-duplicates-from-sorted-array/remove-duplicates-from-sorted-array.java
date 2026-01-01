class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        ArrayList<Integer> numsNew = new ArrayList<>();
        numsNew.add(nums[0]);
        for (int i=1; i<nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                numsNew.add(nums[i]);
                k++;
            }
        }
        for (int i=0; i<k;i++) {
            nums[i] = numsNew.get(i);
        }
        return k;
    }
}