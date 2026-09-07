class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, temp = 0, i = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                temp++;
            } else if (nums[i] == 0) {
                count = Math.max(count, temp);
                temp = 0;
            }
            i++;
            
        }
        return Math.max(count, temp);
    }
}