class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char c1 = stack.pop();
                if((c1=='{' && c!='}') || (c1=='(' && c!=')') || (c1=='[' && c!=']')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
