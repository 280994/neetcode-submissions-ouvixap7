class Solution {
    public double myPow(double x, int n) {
        double result=1;
        if(n<0){
            x=1/x;
            n=n*-1;
        }
        while(n>0){
            result=result*x;
            n--;
        }
        return result;
    }
}
