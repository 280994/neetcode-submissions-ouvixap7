class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> s = new Stack<>();

        for(int i=0; i<temperatures.length; i++){
            int t = temperatures[i];
            while(!s.isEmpty() && s.peek()[0]<t){
                int[] value = s.pop();
                result[value[1]] = i-value[1];

            }
            s.push(new int[]{t, i});
        }
        return result;
    }
}
