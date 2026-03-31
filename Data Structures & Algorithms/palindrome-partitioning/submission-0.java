class Solution {
    List<List<String>> result;
    public List<List<String>> partition(String s) {
        result=new ArrayList<>();
        List<String> part = new ArrayList<>();
        backtracking(0, s, part);
        return result;
    }

    private void backtracking(int i, String s, List<String> part){
        if(i>=s.length()){
            result.add(new ArrayList<>(part));
            return;
        }

        for(int j=i; j<=s.length()-1 ; j++){
            if(isPalindrome(s, i, j)){
                part.add(s.substring(i,j+1));
                backtracking(j+1, s, part);
                part.remove(part.size()-1);
            }
        }
    }

    private boolean isPalindrome(String s, int l, int r){
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
