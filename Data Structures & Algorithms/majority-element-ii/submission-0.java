class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        int n = nums.length/3;
        for(int num:nums){
            count.put(num, count.getOrDefault(num,0)+1);
            if(count.size()>2){
                HashMap<Integer, Integer> newCount = new HashMap<>();
                for(int key:count.keySet()){
                    if(count.get(key)>1){
                        newCount.put(key,count.get(key)-1);
                    }
                }
                count=newCount;
            }
        }

        for(int key:count.keySet()){
            int freq=0;
            for(int num:nums){
                if(key==num){
                    freq++;
                }
            }
            if(freq>n){
                result.add(key);
            }
        }
        return result;
    }
}