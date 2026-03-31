class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int result=0, sum=0, i=0, j=0;
        while(j<arr.length){
            sum+=arr[j];
            if(j>=k-1){
                if(sum/k>=threshold){
                    result++;
                }
                sum=sum-arr[i];
                i++;
            }
            j++;
        }
        return result;
    }
}