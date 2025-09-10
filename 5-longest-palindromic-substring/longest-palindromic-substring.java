class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        int start=0,maxlen=1;

        for(int i=0;i<len;i++){

            int left=i,right=i;
            while(left>=0 && right<len && s.charAt(left)==s.charAt(right))
            {
                if(right-left+1>maxlen){
                    start=left;
                    maxlen=right-left+1;
                }
                left--;
                right++;
            }

            left=i;right=i+1;
            while(left>=0 && right<len && s.charAt(left)==s.charAt(right))
            {
                if(right-left+1>maxlen){
                    start=left;
                    maxlen=right-left+1;
                }
                left--;
                right++;
            }
        }
        return s.substring(start,start+maxlen);
    }
}