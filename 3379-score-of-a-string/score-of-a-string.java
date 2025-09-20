class Solution {
    public int scoreOfString(String s) {
        int len=s.length();
        int sum=0;
        for(int i=1;i<len;i++){
            int diff=Math.abs(s.charAt(i)-s.charAt(i-1));
            sum+=diff;
        }
        return sum;
    }
}