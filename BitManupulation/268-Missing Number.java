class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        int total=len*(len+1)/2;
        int sum=0;
        for(int n:nums){
            sum =sum+n;
        }
        return total-sum;
    }
}