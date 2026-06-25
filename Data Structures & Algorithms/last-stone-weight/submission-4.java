class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length<2){
            return stones[0];
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            maxHeap.offer(stone);
        }

        while(maxHeap.size()>1){
            int value1=maxHeap.poll();
            int value2 = maxHeap.poll();
            if((value1-value2)>0){
                maxHeap.offer(value1-value2);
            }
        }

        return maxHeap.size()>0?maxHeap.peek():0;
    }
}
