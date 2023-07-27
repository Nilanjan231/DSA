class Solution {
    public int removeDuplicates(int[] nums) {
     // Edge case: If the array is empty, return 0.
        if (nums.length == 0) {
            return 0;
        }

        // Initialize pointers and count variables.
        int current = 1; // Pointer to the current position where the next unique element should be placed.
        int count = 1;   // Count of the current element (initialized to 1 as we have at least one occurrence of the first element).

        // Start from the second element and traverse the array.
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                // If the current element is the same as the previous one, increment the count.
                count++;
            } else {
                // If the current element is different from the previous one, reset the count to 1.
                count = 1;
            }

            if (count <= 2) {
                // If the count is less than or equal to 2, keep the element and place it at the current pointer.
                nums[current] = nums[i];
                current++;
            }
            // If the count is greater than 2, skip the element (do nothing) to remove the duplicates.
        }

        return current; // 'current' now holds the length of the modified array with duplicates removed.
   
    }
}