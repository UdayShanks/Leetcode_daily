class Solution {
    public int[] searchRange(int[] nums, int target) {
        int x=-1,y=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                x=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                y=i;
                break;
            }
        }
        return new int[] {x,y};
    }
}