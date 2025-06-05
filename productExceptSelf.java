class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        int prodRight = 1;
        int prodLeft = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] = prodRight;
            prodRight *= nums[i];
        }

        for (int i = 0; i < n; i++) {
            result[i] *= prodLeft;
            prodLeft *= nums[i];
        }
        return result;
    }
}
