class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> stonesQueue = new PriorityQueue(Comparator.reverseOrder());
        for(int stone: stones){
            stonesQueue.add(stone);
        }

        while(stonesQueue.size()>1){
            int s1 = stonesQueue.poll();
            int s2 = stonesQueue.poll();
            if(s1!=s2){
                stonesQueue.add(Math.abs(s1-s2));
            }
        }
        if(stonesQueue.size()==0){
            return 0;
        }
        else{
            return stonesQueue.peek();
        }
    }
}
