class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int val = -1;
        for(int n : nums){
            if(n%2 == 0){
                map.put(n, map.getOrDefault(n,0)+1);
            }
        }
        for(int n : nums){
            if(n%2 == 0){
                int temp = map.get(n);
                if(temp > count || (temp == count && n < val)){
                    count = temp;
                    val = n;
                }
            }
        }
        return val;
    }
}