class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> resultMap = new HashMap<>();
        for(Integer i:nums){
            resultMap.put(i, resultMap.getOrDefault(i,0)+1);
        }

        int[] topKeys = resultMap.entrySet().stream()
                // Sort entries by value in reverse (descending) order
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                // Limit the stream to the top N entries
                .limit(k)
                // Map each entry to its key
                .map(Map.Entry::getKey).mapToInt(Integer::intValue).toArray();

        return topKeys;
    }
}
