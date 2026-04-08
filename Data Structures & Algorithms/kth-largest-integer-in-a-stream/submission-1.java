class KthLargest {

    private PriorityQueue<Integer> minHeap;
    private int count;

    public KthLargest(int k, int[] nums) {
        minHeap=new PriorityQueue<>();
        count=k;
        for(int num:nums){
            minHeap.offer(num);
            if(minHeap.size()>count){
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size()>count){
                minHeap.poll();
        }
        return minHeap.peek();
    }
}
