class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
            String sub="";
            for(int j=i;j<needle.length()+i;j++){
                sub = sub + haystack.charAt(j);
                if (sub.equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}