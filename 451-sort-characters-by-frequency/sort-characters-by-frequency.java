class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        List<Character> chars=new ArrayList<>(map.keySet());
        Collections.sort(chars,(a,b)->map.get(b)-map.get(a));
        StringBuilder sb=new StringBuilder();
        for(char ch:chars){
            int freq=map.get(ch);
            for(int i=0;i<freq;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}