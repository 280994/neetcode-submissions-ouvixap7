class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles).max().getAsInt();
        int i=1,k=max;
        while(i<=k){
            int j = i+((k-i)/2);
            long total=0;
            for(int pile:piles){
                total=total+((pile+j-1)/j);
            }
            if(total>h){
                i=j+1;
            }
            else {
                max=j;
                k=j-1;
            }
        }
        return max;
    }
}
