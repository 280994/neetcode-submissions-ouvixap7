class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();

        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c]==0){
                    q.add(new int[]{r,c});
                }
            }
        }

        if(q.size()==0){
            return;
        }

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){
            int[] node = q.poll();
            int r = node[0];
            int c = node[1];
            for(int[] dir: directions){
                int row = r+dir[0];
                int col = c+dir[1];
                if(row>=0 && row<rows && col>=0 && col<cols && grid[row][col]==Integer.MAX_VALUE){
                    q.add(new int[]{row,col});
                    grid[row][col] = grid[r][c]+1;
                }
                
            }
        }

    }
}
