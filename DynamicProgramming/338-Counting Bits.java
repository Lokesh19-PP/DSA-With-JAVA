class Solution {
    public int[] countBits(int n) {
        int[] A = new int[n+1];
        A[0] = 0;
        for(int i=1;i<=n;i++){
            A[i] = A[i >> 1] + (i & 1);
        }
        return A;
    }
}