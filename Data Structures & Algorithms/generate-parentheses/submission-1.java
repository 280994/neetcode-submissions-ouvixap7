class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder curr = new StringBuilder();
        backtracking(result, curr, 0, 0 , n);
        return result;
    }

    private void backtracking(List<String> result, StringBuilder curr, int open, int close, int n){
        if(open==n && close==n){
            result.add(curr.toString());
        }
        if(open<n){
            curr.append("(");
            backtracking(result, curr, open+1, close , n);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open){
            curr.append(")");
            backtracking(result, curr, open, close+1 , n);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}
