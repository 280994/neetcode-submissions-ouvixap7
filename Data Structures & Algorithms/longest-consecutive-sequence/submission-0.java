class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        HashSet<Integer> numSet = new HashSet<>();
        for(int i:nums){
            numSet.add(i);
        }
        for(int num:numSet){
            if(!numSet.contains(num-1)){
                int length=1;
                while(numSet.contains(num+length)){
                    length++;
                }
                result= Math.max(result,length);
            }
        }
        return result;
    }
}
