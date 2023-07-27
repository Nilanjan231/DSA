class Solution {
    public int hIndex(int[] citations) {
    Arrays.sort(citations)  ;
    int n = citations.length;
    int hIndex = 0;
    for (int i = n - 1; i >= 0; i--) {
            int h = n - i; // Current value of h
            if (citations[i] >= h) {
                hIndex = h; // Update hIndex if the condition holds
            } else {
                break; // No need to check further, as the array is sorted in ascending order
            }
        }
        return hIndex;
    }
}