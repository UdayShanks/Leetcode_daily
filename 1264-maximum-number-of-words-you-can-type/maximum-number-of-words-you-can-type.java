class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words=text.split(" ");
        int count=0;

        Set<Character> brokemap=new HashSet<>();
        for(char c:brokenLetters.toCharArray()){
            brokemap.add(c);
        }

        for(String word:words){
            boolean can=true;
            for(char ch:word.toCharArray()){
                if(brokemap.contains(ch)){
                    can=false;
                    break;
                }
            }
            if(can){
                count++;
            }
        }
        return count;
    }
}