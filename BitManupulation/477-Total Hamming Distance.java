class Solution {
    public int totalHammingDistance(int[] nums) {
        int n = nums.length;
        int total = 0;   
        for(int i=0;i<32;i++){
            int count=0;
            for(int no : nums){
                if((no& (1 << i)) != 0){
                    count++;
                }
            }
            int countzero = n - count;
            total += count * countzero;
        }
        return total;
    }
}