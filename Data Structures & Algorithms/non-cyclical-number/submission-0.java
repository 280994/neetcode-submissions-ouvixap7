class Solution {
    public boolean isHappy(int n) {
        Set<Integer> numSet = new HashSet<>();
        while(!numSet.contains(n)){
            numSet.add(n);
            n = sumOfSquare(n);
            if(n==1){
                return true;
            }
            
        }
        return false;
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
