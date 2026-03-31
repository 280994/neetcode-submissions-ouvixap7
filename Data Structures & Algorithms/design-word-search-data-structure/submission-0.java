class WordDictionary {
    TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;
        for(char c: word.toCharArray()){
            int i = c-'a';
            if(curr.children[i]==null){
                curr.children[i] = new TrieNode();
            }
            curr=curr.children[i];
        }
        curr.endOfWord=true;
    }

    public boolean search(String word) {
        return dfs(0, word, root);
    }

    private boolean dfs(int j, String word, TrieNode root){
        TrieNode curr=root;
        for(int i=j; i<word.length(); i++){
            char c = word.charAt(i);
            if(c=='.'){
                for(TrieNode child:curr.children){
                    if(child!=null && dfs(i+1, word, child)){
                        return true;
                    }
                }
                return false;
            }
            else{
                int index = c-'a';
                if(curr.children[index]==null){
                    return false;
                }
                curr=curr.children[index];
            }
        }
        return curr.endOfWord;
    }
}

class TrieNode{
    TrieNode[] children = new TrieNode[26];
    boolean endOfWord = false;
}