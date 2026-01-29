class Solution {
    public int reverseBits(int n){
        int binary_reverse = 0;
        for(int i=0;i<32;i++){
            int bit = (n >> i) & 1;
            binary_reverse |= bit << (31-i);
        }
        return binary_reverse;
    }
}