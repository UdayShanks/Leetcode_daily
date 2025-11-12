class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> set=new HashMap<>();
        int n=words.length;
        for(int i=0;i<n;i++){
            set.put(words[i],set.getOrDefault(words[i],0)+1);
        }
        List<Map.Entry<String,Integer>> list=new ArrayList<>(set.entrySet());
        list.sort(Comparator.comparing(Map.Entry<String,Integer>::getValue).reversed().thenComparing(Map.Entry<String,Integer>::getKey));
        List<String> l=new LinkedList<>();
        for(int i=0;i<k;i++)
        {
            l.add(list.get(i).getKey());
        }
        return l;
    }
    
}