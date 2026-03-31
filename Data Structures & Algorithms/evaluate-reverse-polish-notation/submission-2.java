class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                stack.push(stack.pop()+stack.pop());
            }
            else if(s.equals("-")){
                int value1 = stack.pop();
                int value2 = stack.pop();
                stack.push(value2-value1);
            }
            else if(s.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }
            else if(s.equals("/")){
                int value1 = stack.pop();
                int value2 = stack.pop();
                stack.push(value2/value1);
            }
            else{
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }
}
