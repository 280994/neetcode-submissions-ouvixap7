class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }

        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        int[] arr = new int[num1.length()+num2.length()];
        for(int i=0; i<num1.length(); i++){
            for(int j=0; j<num2.length(); j++){
                int digit = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                arr[i+j]=arr[i+j]+digit;
                arr[i+j+1]=arr[i+j+1]+(arr[i+j]/10);
                arr[i+j]=arr[i+j]%10;
            }
        }

        StringBuilder result = new StringBuilder();
        int i = arr.length-1;
        while(i>=0 && arr[i]==0){
            i--;
        }
        while(i>=0){
            result.append(arr[i]);
            i--;
        }
        return result.toString();
    }
}
