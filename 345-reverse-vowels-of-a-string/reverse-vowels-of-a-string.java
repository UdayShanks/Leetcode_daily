class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        int len=s.length();
        String str="AaEeIiOoUu";
        char[] carr=s.toCharArray();
        char[] carr2=s.toCharArray();
        for(char c:carr2){
            if(str.indexOf(c)!=-1){
                st.push(c);
            }
        }
        for(char ch:carr){
            if(str.indexOf(ch)!=-1){
                sb.append(st.pop());
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}