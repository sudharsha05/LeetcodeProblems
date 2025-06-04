class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> values = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = values.get(nums[i]);
            if (index != null) {
                return new int[] { i, index };
            }
            values.put(target - nums[i], i);
        }
        return nums;
    }
}
