class Solution {
    public boolean isAnagram(String s, String t) {
        int[] str = new int[26];
        int[] trt = new int[26];
        for(int i=0;i<s.length();i++){
            str[s.charAt(i) - 'a'] += 1;
        }
        for(int i=0;i<t.length();i++){
            trt[t.charAt(i) - 'a'] += 1;
        }
        for(int i=0;i<str.length;i++){
            if(str[i] == trt[i]){
                continue;
            }
            return false;
        }
        return true;
    }
}