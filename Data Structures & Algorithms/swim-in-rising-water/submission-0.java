class Solution {
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        boolean[][] visited = new boolean[grid.length][grid.length];
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

        pq.add(new int[]{grid[0][0],0,0});
        visited[0][0]=true;

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int value=curr[0];
            int r=curr[1];
            int c = curr[2];
            if(r==n-1 && c==n-1){
                return value;
            }
            for(int[] dir:directions){
                int row=r+dir[0];
                int col=c+dir[1];
                if(row>=0 && row<n && col>=0 && col<n && !visited[row][col]){
                    pq.add(new int[]{Math.max(value,grid[row][col]), row, col});
                    visited[row][col]=true;
                }
                
            }
        }
        return n*n;
    }
}
