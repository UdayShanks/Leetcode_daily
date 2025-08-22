class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            int cur=nums[i];
            int x=target-nums[i];
            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            }
            map.put(cur,i);
        }
        return null;
    }
}