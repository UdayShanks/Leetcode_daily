class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list=new LinkedList<>();
        Map<Character,Integer> map=new HashMap<>();
        int len=s.length();
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            map.put(ch,i);
        }
        int st=0;
        int last=map.get(s.charAt(0));
        for(int i=0;i<len;i++){
            last=Math.max(last,map.get(s.charAt(i)));
            if(i==last){
                int size=last-st+1;
                list.add(size);
                st=last+1;
            }
        }
        return list;
    }
}