class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0){
            return false;
        }
        Map<Integer, Integer> count = new HashMap<>();
        for(int i:hand){
            count.put(i, count.getOrDefault(i,0)+1);
        }

        Arrays.sort(hand);
        for(int val:hand){
            if(count.get(val)>0){
                for(int i=val;i<val+groupSize;i++){
                    if(count.getOrDefault(i,0)==0){
                        return false;
                    }
                    count.put(i,count.get(i)-1);
                }
            }
        }
        return true;
    }
}
