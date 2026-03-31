class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        for(int i=0;i<numbers.length; i++){
           int s = target-numbers[i];
            if(sumMap.containsKey(s)){
                return new int[]{ sumMap.get(s), i+1};
            }
            sumMap.put(numbers[i], i+1);
        }
        return new int[0];
    }
}
