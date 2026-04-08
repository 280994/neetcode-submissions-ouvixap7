class TrieNode{
    TrieNode[] children = new TrieNode[26];
    boolean endOfWord=false;
}

class WordDictionary {

    private TrieNode node;

    public WordDictionary() {
        node = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr=node;
        for(char c:word.toCharArray()){
            int i=c-'a';
            if(curr.children[i]==null){
                curr.children[i]=new TrieNode();
            }
            curr=curr.children[i];
        }
        curr.endOfWord=true;
    }

    public boolean search(String word) {
        return dfs(word, 0, node);
    }

    private boolean dfs(String word, int j, TrieNode root){
        TrieNode curr=root;
        for(int i=j; i<word.length();i++){
            char c = word.charAt(i);
            if(c=='.'){
                for(TrieNode child:curr.children){
                    if(child!=null && dfs(word, i+1, child)){
                        return true;
                    }
                }
                return false;
            }
            else{
                int index=c-'a';
                if(curr.children[index]==null){
                    return false;
                }
                curr=curr.children[index];
            }
        }
        return curr.endOfWord;
    }
}
