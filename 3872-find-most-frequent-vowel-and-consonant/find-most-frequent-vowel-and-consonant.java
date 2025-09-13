class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxfreqv=0;
        int maxfreqc=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            char c=entry.getKey();
            int freq=entry.getValue();
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                maxfreqv=Math.max(maxfreqv,freq);
            }
            else{
                maxfreqc=Math.max(maxfreqc,freq);
            }
        }
        return maxfreqv+maxfreqc;
    }
}