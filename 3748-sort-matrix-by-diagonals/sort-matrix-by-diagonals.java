class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        int[][] ans=new int[n][n];
        Map<Integer,List<Integer>> dgMap=new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dgMap.computeIfAbsent(i-j,k->new ArrayList<>()).add(grid[i][j]);
            }
        }
        for(Map.Entry<Integer,List<Integer>> entry:dgMap.entrySet()){
            List<Integer> list=entry.getValue();
            int key=entry.getKey();
            if(key<0){
                list.sort(Comparator.naturalOrder());
            }
            else{
                list.sort(Comparator.reverseOrder());
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                List<Integer> list=dgMap.get(i-j);
                ans[i][j]=list.remove(0);
            }
        }
        return ans;

    }
}