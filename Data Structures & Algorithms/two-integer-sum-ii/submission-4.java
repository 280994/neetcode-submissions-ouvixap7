class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> targetMap = new HashMap<>();
        for(int i=0; i<numbers.length;i++){
            if(targetMap.containsKey(numbers[i])){
                return new int[]{targetMap.get(numbers[i])+1, i+1};
            }
            targetMap.put(target-numbers[i], i);
        }
        return new int[]{};
    }
}
