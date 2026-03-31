class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparing(a->a[0]));
        for(int[] point:points){
            int distance = point[0]*point[0] + point[1]*point[1];
            q.add(new int[]{distance, point[0], point[1]});
        }

        int[][] result = new int[k][2];
        for(int i=0; i<k;i++){
            int[] data = q.poll();
            result[i]=new int[]{data[1],data[2]};
        }
        return result;

    }
}
