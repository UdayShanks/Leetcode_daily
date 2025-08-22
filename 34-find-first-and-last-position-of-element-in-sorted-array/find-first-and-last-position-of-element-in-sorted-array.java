class Solution {
    public int[] searchRange(int[] nums, int target) {
        int x=-1,y=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(x==-1){
                    x=i;
                }
                y=i;
            }
        }
        return new int[] {x,y};
    }
}