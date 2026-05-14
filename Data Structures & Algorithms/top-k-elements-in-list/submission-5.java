class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num:nums){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }


        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(Map.Entry<Integer, Integer> m:freqMap.entrySet()){
            minHeap.add(new int[]{m.getValue(), m.getKey()});
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        for(int i=0; i<k;i++){
            result[i]=minHeap.poll()[1];
        } 
        return result;
    }
}
