class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedStr=new StringBuilder();
        for(String s:strs){
            encodedStr.append(s.length()+","+s);
        }
        return encodedStr.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!=','){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            result.add(str.substring(j+1,j+1+length));
            i=j+1+length;
        }
        return result;
    }
}

