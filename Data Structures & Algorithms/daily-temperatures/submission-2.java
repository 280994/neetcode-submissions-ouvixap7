class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();
        for(int i=0; i<temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i]>stack.peek()[0]){
                int[] value = stack.pop();
                result[value[1]]=i-value[1];
            }
            stack.push(new int[]{temperatures[i], i});
        }
        return result;
    }
}
