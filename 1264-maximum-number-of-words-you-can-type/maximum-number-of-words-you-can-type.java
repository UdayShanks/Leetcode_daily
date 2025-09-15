class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split(" ");
        int len=words.length;
        int count=0;
        for(int i=0;i<len;i++){
            int j=0;
            while(j<words[i].length()){
                char c=words[i].charAt(j);
                if(brokenLetters.contains(String.valueOf(c))){
                    break;
                }
                j++;
            }
            if(j==words[i].length())
            {
                count++;
            }
        }
        return count;
    }
}