class Solution {
    int rows, cols;
    public boolean exist(char[][] board, String word) {
        rows = board.length;
        cols = board[0].length;
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                if(backtracking(r,c,0,word,board)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtracking(int row, int col, int index, String word, char[][] board){
        if(index==word.length()){
            return true;
        }
        if(row<0 || col<0 || row>=rows || col>=cols || board[row][col]!=word.charAt(index) || board[row][col]=='*'){
            return false;
        }

        board[row][col]='*';
        boolean res = backtracking(row+1, col, index+1, word, board) ||
                    backtracking(row-1, col, index+1, word, board) ||
                    backtracking(row, col+1, index+1, word, board) ||
                    backtracking(row, col-1, index+1, word, board);
        board[row][col]=word.charAt(index);
        return res;
    }
}
