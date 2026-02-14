class Solution {
    private void consider(int[] candidates,int target , int index , List<Integer> temp,List<List<Integer>> list){
        if(target == 0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i] == candidates[i-1]){
                continue;
            }
            temp.add(candidates[i]);
            consider(candidates,target-candidates[i],i+1,temp,list);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        consider(candidates,target,0,new ArrayList<>(),list);
        return list;
    }
}