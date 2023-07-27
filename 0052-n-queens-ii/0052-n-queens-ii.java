class Solution {
    public int totalNQueens(int n) {
       boolean board[][]=new boolean[n][n];
        return queens(board,0);  
    }
      int queens(boolean[][]board,int row)
    {   if(row == board.length)  return 1;
        int count=0;
        // place the queen and check row and colum
        for(int col=0;col<board.length;col++)
         // place the queen if it is safe
        if(isSafe(board,row,col))
        { board[row][col]=true;
          count+=queens(board,row + 1);
          board[row][col]=false;
         }
          return count;
    }   
  boolean isSafe(boolean [][] board,int row,int col)
  { // checking verticle 
    for(int i=0;i<row;i++)
    if(board[i][col]) return false;
     // checking left digonal
    int maxLeft=Math.min(row,col);
    for(int i=1;i<=maxLeft;i++)
    if(board[row -i][col -i]) return false;
    // checking right digonal
    int maxRight=Math.min(row,board.length - col -1);
    for( int i=1;i<=maxRight;i++)
    if(board[row - i][col + i]) return false;
     // if none of the check is false, means ans is true
     return true;
   }    
    }
