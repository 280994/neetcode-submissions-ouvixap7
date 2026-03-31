class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] track = new double[position.length][2];
        for(int i=0; i<position.length; i++){
            track[i][0] = (double)position[i];
            track[i][1] = (double)(target-position[i])/speed[i];
        }
        Arrays.sort(track, (a,b)-> Double.compare(b[0], a[0]));
        int count = 0;
        double prevTime = 0;
        for (double[] car : track) {
            if (car[1] > prevTime) {
                count++;
                prevTime = car[1];
            }
        }
        
        return count;
    }
}
