class MedianFinder {

    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }
    
    public void addNum(int num) {

        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
			maxHeap.add(num);
		} else {
			minHeap.add(num);
		}

        if(maxHeap.size()>minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        }
        else if(minHeap.size()>maxHeap.size()+1){
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(minHeap.size()==maxHeap.size()){
            return ((double)(minHeap.peek()+maxHeap.peek()))/2;
        }
        return minHeap.size()>maxHeap.size()?minHeap.peek():maxHeap.peek();
    }
}
