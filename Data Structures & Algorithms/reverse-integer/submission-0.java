class Solution {
    public int reverse(int x) {
        int max = 2147483647;
        int min = -2147483648;
        int result=0;
        while(x!=0){
            int remainder = x%10;
            x=x/10;
            if(result>max/10 || (result==max/10 && remainder>(max%10))){
                return 0;
            }
            if(result<min/10 || (result==min/10 && remainder<(min%10))){
                return 0;
            }
            result=(result*10)+remainder;
        }
        return result;
    }
}
