class Solution {
    public int pivotIndex(int[] nums) {
        int tsum=0;
        for(int i=0;i<nums.length;i++){
            tsum=tsum+nums[i];
        }
        int lsum=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            int rsum=tsum-lsum-nums[i];
            
            if(lsum==rsum){
                index=i;
                break;
            }
            else{
                index=-1;
            }
            lsum=lsum+nums[i];
        }
        return index;
    }
}