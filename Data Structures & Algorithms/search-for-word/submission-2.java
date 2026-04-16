class Solution {
    int rows,cols;
    public boolean exist(char[][] board, String word) {
        rows = board.length;
        cols = board[0].length;
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                if(backtracking(board, word, r, c, 0)){
                    return true;
                } 
            }
        }
        return false;
    }

    private boolean backtracking(char[][] board, String word, int r, int c, int index){
        if(index==word.length()){
            return true;
        }
        if(r<0 || c<0 || r>rows-1 || c>cols-1 || board[r][c]!=word.charAt(index) || board[r][c]=='*'){
            return false;
        }

        board[r][c]='*';
        boolean isPresent = backtracking(board, word, r+1, c, index+1) ||
                            backtracking(board, word, r-1, c, index+1) ||
                            backtracking(board, word, r, c+1, index+1) ||
                            backtracking(board, word, r, c-1, index+1);
        board[r][c]=word.charAt(index);
        return isPresent;
    }
}
