class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int num:nums){
            List<List<Integer>> newPerms = new ArrayList<>();
            for(List<Integer> perms:result){
                for(int i=0; i<=perms.size(); i++){
                    List<Integer> copyPerms = new ArrayList<>(perms);
                    copyPerms.add(i,num);
                    newPerms.add(copyPerms);
                }
            }
            result=newPerms;
        }
        return result;
    }
}
