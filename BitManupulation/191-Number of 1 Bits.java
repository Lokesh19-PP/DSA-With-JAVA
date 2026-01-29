class Solution {
    private int calculate(int n){
        int count = 0;
        for(int i=0;i<32;i++){
            int mask = 1 << i;
            int get = mask & n;
            if(get != 0){
                count++;
            }
        }
        return count;
    }
    public int hammingWeight(int n) {
        return calculate(n);
    }
}