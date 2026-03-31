class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r = Arrays.stream(piles).max().getAsInt();
        int l=1, result=r;
        while(l<=r){
            int mid = l+((r-l)/2);
            long total=0;
            for(int pile:piles){
                total=total+(long)Math.ceil((double)pile/mid);
            }
            if(total<=h){
                result=Math.min(result,mid);
                r=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return result;
    }
}
