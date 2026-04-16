class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        helper(result, curr, s, 0);
        return result;
    }

    private void helper(List<List<String>> result, List<String> curr, String s, int index){
        if(index>=s.length()){
            result.add(new ArrayList<>(curr));
        }

        for(int j=index; j<s.length();j++){
            if(isPalindrome(index,j,s)){
                curr.add(s.substring(index,j+1));
                helper(result, curr, s, j+1);
                curr.remove(curr.size()-1);
            }
        }
    }

    private boolean isPalindrome(int l, int r, String s){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
