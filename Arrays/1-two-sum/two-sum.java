class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> indexMap = new HashMap<>();
        indexMap.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (indexMap.containsKey(target - nums[i])) {
                indices[0] = indexMap.get(target-nums[i]);
                indices[1] = i;
                break;
            }
            indexMap.put(nums[i], i);
        }
        return indices;
    }
}