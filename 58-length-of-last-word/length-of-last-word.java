class Solution {
    public int lengthOfLastWord(String s) {
        String[] words=s.split(" ");
        int len=words.length;
        int count=0;
        for(int i=len-1;i>len-2;i--){
            count =words[i].length();
        }
        return count;
    }
}