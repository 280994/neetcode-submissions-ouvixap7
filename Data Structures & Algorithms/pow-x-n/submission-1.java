class Solution {
    public double myPow(double x, int n) {
        double result= helper(x, Math.abs((long)n));
        return n>0?result:1/result;
    }

    private double helper(double x, long n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        double result = helper(x,n/2);
        if(n%2!=0){
            result=result*result*x;
        }
        else{
            result=result*result;
        }
        return result;
    }
}
