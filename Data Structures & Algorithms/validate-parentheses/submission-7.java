class Solution {
    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='['){
                charStack.push(c);
            }
            else{
                if(charStack.isEmpty()){
                    return false;
                }
                char value = charStack.pop();
                if((value=='{' && c!='}') || (value=='(' && c!=')') || (value=='[' && c!=']')){
                    return false;
                }
            }
        }
        return charStack.isEmpty();
    }
}
