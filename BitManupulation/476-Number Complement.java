class Solution {
    public int findComplement(int num) {
        String n = Integer.toBinaryString(num);
        StringBuilder no = new StringBuilder(n);
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) == '0'){
                no.setCharAt(i,'1');
            }
            else{
                no.setCharAt(i,'0');
            }
        }
        return Integer.parseInt(no.toString(),2);
    }
}