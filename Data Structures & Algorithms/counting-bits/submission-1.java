class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        result[0]=0;
        for(int i=1; i<=n; i++){
            int count=0;
            int num=i;
            while(num>0){
                num=num&num-1;
                count++;
            }
            result[i]=count;
        }
        return result;
    }
}
