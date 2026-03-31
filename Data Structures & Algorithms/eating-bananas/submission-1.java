class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int j = Arrays.stream(piles).max().getAsInt();
        int i=1, result=j;
        while(i<=j){
            int mid = i+(j-i)/2;
            long total = 0;
            for(int pile:piles){
                total=total+(long)Math.ceil((double)pile/mid);
            }
            if(total>h){
                i=mid+1;
            }
            else{
                j=mid-1;
                result=mid;
            }
            
        }
        return result;
    }
}
