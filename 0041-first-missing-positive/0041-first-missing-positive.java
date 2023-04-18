class Solution {

    public int firstMissingPositive(int[] nums) {
        int[] arr = new int[nums.length];
        for (int num : nums) {
            if (num > 0 && num <= nums.length) {
                arr[num - 1] = num;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return arr.length + 1;
    }
}