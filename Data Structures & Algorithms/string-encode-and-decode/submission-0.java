class Solution {

    public String encode(List<String> strs) {
        String encodedStr = "";
        for(String s:strs){
            encodedStr=encodedStr + s.length()+","+ s;
        }
        System.out.println(encodedStr);
        return encodedStr;
    }

    public List<String> decode(String str) {
       List<String> decodedStr = new ArrayList<>();
       int i=0;
       while (i<str.length()){
        int j=i;
        while(str.charAt(j)!=','){
            j++;
        }
        int lengthStr = Integer.parseInt(str.substring(i,j));
        decodedStr.add(str.substring(j+1,j+1+lengthStr));
        i=j+1+lengthStr;
       }
       return decodedStr;
    }
}
