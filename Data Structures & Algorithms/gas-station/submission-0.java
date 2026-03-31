class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas=0;
        int totalCost=0;
        int total=0;
        int result=0;
        for(int i=0; i<gas.length;i++){
            totalGas=totalGas+gas[i];
            totalCost=totalCost+cost[i];
            total+=gas[i]-cost[i];
            if(total<0){
                total=0;
                result=i+1;
            }
        }
        if(totalGas<totalCost){
            return -1;
        }
        else{
            return result;
        }
    }
}
