class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int count = Integer.MAX_VALUE;
        for(int i=matrix.length-1; i>=0; i--){
            if(matrix[i][0]==target){
                return true;
            }else if(matrix[i][0]>target){
                if(count>i){
                    count = i;
                }
            }else{
                count = i;
                break;
            }
        }
        int start = 0;
        int end = matrix[0].length-1; 
        while(start<=end){
            int mid = (start+end)/2;
            if(matrix[count][mid]>target){
                end = mid-1;
            }else if(matrix[count][mid]<target){
                start = mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}