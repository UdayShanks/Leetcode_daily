class Solution {
    public void moveZeroes(int[] nums) {
        LinkedList<Integer> list=new LinkedList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                list.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0){
                list.add(0);
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
    }
}