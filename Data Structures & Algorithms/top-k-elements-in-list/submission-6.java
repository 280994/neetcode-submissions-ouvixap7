class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int[] result = new int[k];
        for(int num:nums){
            numsMap.put(num, numsMap.getOrDefault(num,0)+1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(Map.Entry<Integer,Integer> entry:numsMap.entrySet()){
            minHeap.offer(new int[]{entry.getValue(), entry.getKey()});
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        for(int i=0;i<k;i++){
            result[i]=minHeap.poll()[1];
        }

        return result;
    }
}
