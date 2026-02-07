class Solution {
    private String reverse(String s){
        String[] words = s.split(" +");
        StringBuilder str = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            str.append(words[i]);
            str.append(" ");
        }
        return str.toString().trim();
    }
    public String reverseWords(String s) {
        return reverse(s);
    }
}