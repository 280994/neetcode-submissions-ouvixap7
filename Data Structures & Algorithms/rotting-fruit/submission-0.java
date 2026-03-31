class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int[]> q = new LinkedList<>();
        int fresh=0;
        int time=0;
        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){
                if(grid[r][c]==1){
                    fresh++;
                }
                if(grid[r][c]==2){
                    q.add(new int[]{r,c});
                }
            }
        }

        while(fresh>0 && !q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] curr = q.poll();
                int row = curr[0];
                int col = curr[1];
                for(int[] dir:directions){
                    int r = row+dir[0];
                    int c = col+dir[1];
                    if(r>=0 && r<rows && c>=0 && c<cols && grid[r][c]==1){
                        grid[r][c]=2;
                        q.add(new int[]{r,c});
                        fresh--;
                    }
                }
            }
            time++;
        }
        return fresh==0?time:-1;
    }
}
