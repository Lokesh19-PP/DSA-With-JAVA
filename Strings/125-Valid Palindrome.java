import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        if(s==null){
            return true;
        }
        s=s.toLowerCase();
        String S="";
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        for(int i=s.length()-1;i>=0;i--){
            S= S+s.charAt(i);
        }
        if(s.equals(S)){
            return true;
        }
        else{
            return false;
        }
    }
}