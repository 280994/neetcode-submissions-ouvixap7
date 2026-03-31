class Solution {
    public boolean isHappy(int n) {
        int slow=n, fast = sumOfSquare(n);
        while(slow!=fast){
            fast = sumOfSquare(fast);
            fast = sumOfSquare(fast);
            slow = sumOfSquare(slow);
        }
        if(fast==1){
            return true;
        }
        else{
            return false;
        }
    }

    private int sumOfSquare(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem*rem;
            n=n/10;
        }
        return sum;
    }
}
