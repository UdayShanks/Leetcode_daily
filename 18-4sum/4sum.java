class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len=nums.length;

        Arrays.sort(nums);
        List<List<Integer>> arr=new ArrayList<>();

        for(int i=0;i<len;i++){
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int j=i+1;
            while(j<len){
                int p=j+1;
                int q=len-1;

                while(p<q)
                {
                    long sum=(long)nums[i]+nums[j]+nums[p]+nums[q];
                    
                    if(sum<target) p++;

                    else if(sum>target)  q--;

                    else
                    {
                        arr.add(Arrays.asList(nums[i],nums[j],nums[p],nums[q]));
                        p++;
                        q--;

                        while(p<q && nums[p]==nums[p-1]) p++;
                    }
                }
                j++;
                while(j<len && nums[j]==nums[j-1]) j++;
            }
        
        }
        return arr;
    }
}