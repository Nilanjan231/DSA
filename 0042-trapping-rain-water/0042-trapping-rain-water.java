class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) {
            return 0;
        }
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        for (int i = n-2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        int i = 0, j = n-1, res = 0;
        while (i < j) {
            if (height[i] < height[j]) {
                res += leftMax[i] - height[i];
                i++;
            } else {
                res += rightMax[j] - height[j];
                j--;
            }
        }
        return res;
    }
}
