class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int stone:stones){
            maxHeap.offer(stone);
        }

        while(maxHeap.size()>1){
            int val1 = maxHeap.poll();
            int val2 = maxHeap.poll();
            if(val1!=val2){
                maxHeap.offer(val1-val2);
            }
        }
        if(maxHeap.peek()!=null){
            return maxHeap.peek();
        }
        else{
            return 0;
        }
    }
}
