class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int no1 = 3;
        int no2 = 2;
        int no3 = 0;
        for(int i=3;i<n;i++){
            no3=no1+no2;
            no2=no1;
            no1=no3;
        }
        return no3;
    }
}