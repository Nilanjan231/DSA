
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x= nums1.length+nums2.length;
        int arr[]=new int[x];
        for (int i = 0; i < nums1.length; i = i + 1)
            arr[i]=nums1[i];

           for (int i = 0; i < nums2.length; i = i + 1) 
           arr[i+nums1.length]=nums2[i];
        Arrays.sort(arr);
        if (x % 2 != 0)
            return (double)arr[x / 2];
 
        return (double)(arr[(x - 1) / 2] + arr[x / 2]) / 2.0;
    }
}