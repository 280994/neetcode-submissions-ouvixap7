class Solution {
    public int longestConsecutive(int[] nums) {
        int result=0;
        HashSet<Integer> numsSet = new HashSet<>();
        for(int num:nums){
            numsSet.add(num);
        }

        for(int num:nums){
            int length=1;
            if(!numsSet.contains(num-1)){
                while(numsSet.contains(num+length)){
                    length++;
                }
                result=Math.max(result, length);
            }
        }
        return result;
    }
}
