class Solution {
    public int majorityElement(int[] nums) {
        int element = nums[0];
        int counter=0;
        for(int i=0; i<nums.length; i++){
            if(counter==0){
                element = nums[i];
            }
            if(nums[i]==element){
                counter++;
            }
            else{
                counter--;
            }
            
        }
        return element;
    }
}