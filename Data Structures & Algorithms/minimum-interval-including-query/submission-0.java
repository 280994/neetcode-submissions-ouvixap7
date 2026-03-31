class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        int[] result = new int[queries.length];
        int i=0;
        for(int q: queries){
            int min=Integer.MAX_VALUE;
            for(int[] interval:intervals){
                if(interval[0]<=q && q<=interval[1]){
                    min = Math.min(min,interval[1]-interval[0]+1);
                }
            }
            if(min==Integer.MAX_VALUE){
                result[i]=-1;
            }
            else{
                result[i]=min;
            }
            i++;
        }
        return result;
    }
}
