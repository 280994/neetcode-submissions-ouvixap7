class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> opStack = new Stack<>();
        for(String s:operations){
            if(s.equals("+")){
                int val = opStack.pop();
                int val2 = opStack.peek();
                opStack.push(val);
                opStack.push(val+val2);
            }
            else if(s.equals("C")){
                opStack.pop();
            }
            else if(s.equals("D")){
                int val = opStack.peek();
                opStack.push(val*2);
            }
            else{
                opStack.push(Integer.valueOf(s));
            }
        }

        int result=0;
        while(!opStack.isEmpty()){
            result+=opStack.pop();
        }
        return result;
    }
}