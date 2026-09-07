class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int i = 0;
        if (nums.length == 0) {
            return new int[0];
        }
        for (int j = 0; j < nums.length*2; i++, j++) {
            if (j == nums.length) {
                i = 0;
            }
            ans[j] = nums[i];
        }
        return ans;
    }
}