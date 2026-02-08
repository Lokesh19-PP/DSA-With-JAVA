class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int no : nums){
            set.add(no);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}