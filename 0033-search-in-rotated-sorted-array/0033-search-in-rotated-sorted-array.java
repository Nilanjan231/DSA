class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int k=0;;
        for(int i=0; i<n; i++){
         if(nums[i]==target)
         {k=i; break;} 
         k=-1;   
        }
        return k;   
          }
}