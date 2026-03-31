class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder cur = new StringBuilder();
        backtracking(0, 0, cur, result, n);
        return result;
    }

    private void backtracking(int open, int close, StringBuilder cur, List<String> result, int n){
        if(open==n && close==n){
            result.add(cur.toString());
        }

        if(open<n){
            cur.append('(');
            backtracking(open+1, close, cur, result, n);
            cur.deleteCharAt(cur.length()-1);
        }
        if(open>close){
            cur.append(')');
            backtracking(open, close+1, cur, result, n);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}
