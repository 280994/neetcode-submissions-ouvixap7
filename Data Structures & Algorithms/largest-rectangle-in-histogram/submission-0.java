class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        int maxArea = 0;
        int length = heights.length;
        for(int i=0; i<length; i++){
            int start = i;
            while(!stack.isEmpty() && stack.peek().getValue()>heights[i]){
                Pair<Integer, Integer> pair = stack.pop();
                maxArea = Math.max(maxArea, (i-pair.getKey())*pair.getValue());
                start = pair.getKey();
            }
            stack.push(new Pair<>(start, heights[i]));
        }
        int size = stack.size();
        for(int i=0; i<size; i++){
            Pair<Integer, Integer> pair = stack.pop();
            maxArea = Math.max(maxArea, (length-pair.getKey())*pair.getValue());
        }
        return maxArea;
    }
}
