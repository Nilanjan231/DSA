class Solution {
    public int[] searchRange(int[] nums, int target) {
        int c=0;
        int arr[] = {-1,-1};
        for(int i=0; i<nums.length; i++)
        {  if(nums[i]==target&&c==0){
            arr[0]=i;
            c++;
        }
        if(nums[i]==target)
          arr[1]=i;              
        }
        return arr;
    }
}