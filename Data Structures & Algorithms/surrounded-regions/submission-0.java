class Solution {
    private static final int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if((r==0 || r==rows-1 || c==0 || c==cols-1) && board[r][c]=='O'){
                    dfs(r,c,rows,cols,board);
                }
            }
        }

        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(board[r][c]=='O'){
                    board[r][c]='X';
                }
            }
        }

        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(board[r][c]=='T'){
                    board[r][c]='O';
                }
            }
        }
        
    }

    private void dfs(int r, int c, int rows, int cols, char[][] board){
        if(r<0 || r>=rows || c<0 || c>=cols || board[r][c]!='O'){
            return;
        }
        board[r][c]='T';
        for(int[] dir:directions){
            dfs(r+dir[0], c+dir[1], rows, cols, board);
        }
    }
}
