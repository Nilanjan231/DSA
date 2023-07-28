class Solution {
    public int candy(int[] ratings) {
    int n = ratings.length;
        int[] candies = new int[n];

        // Initialize all children with 1 candy
        Arrays.fill(candies, 1);

        // Traverse from left to right to check ratings with neighbors on the left side
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Traverse from right to left to check ratings with neighbors on the right side
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Sum up all the candies to get the minimum number needed
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }
}