class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stackToken = new Stack<>();
        for(String s: tokens){
            if(s.equals("+")){
                stackToken.push(stackToken.pop()+stackToken.pop());   
            }
            else if(s.equals("-")){
                Integer v1 = stackToken.pop();
                Integer v2 = stackToken.pop();
                stackToken.push(v2-v1);
            }
            else if(s.equals("*")){
                stackToken.push(stackToken.pop()*stackToken.pop());
            }
            else if(s.equals("/")){
                Integer v1 = stackToken.pop();
                Integer v2 = stackToken.pop();
                stackToken.push(v2/v1);
            }
            else{
                stackToken.push(Integer.valueOf(s));
            }
        }
        return stackToken.pop();
    }
}
