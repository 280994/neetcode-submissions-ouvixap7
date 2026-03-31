class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int size=0, end=0;
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']=i;
        }
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            size++;
            end = Math.max(count[c-'a'], end);
            if(i==end){
                result.add(size);
                size=0;
            }
        }
        return result;
    }
}
