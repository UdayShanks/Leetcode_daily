class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p=word1.length();
        int q=word2.length();
        // String merge[]=new char[p+q];
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        while(i<p && j<q){
            char c=word1.charAt(i);
            char c1=word2.charAt(j);
            sb.append(c);
            sb.append(c1);
            i++;j++;
        }
        while(i<p){
            char c=word1.charAt(i);
            sb.append(c);
            i++;
        }
        while(j<q){
            char c1=word2.charAt(j);
            sb.append(c1);
            j++;
        }
        return sb.toString();
    }
}