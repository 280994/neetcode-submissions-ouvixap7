class Solution {
    public boolean isValid(String s) {
        Stack<Character> paranStack = new Stack<>();
        for(char c:s.toCharArray()){
            if (c == '(' || c == '{' || c == '[') {
                paranStack.push(c);
            } 
            else {
                if (paranStack.isEmpty()) return false;
                char top = paranStack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return paranStack.empty();
    }
}
