class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int len=nums.length;
        for(int num:nums){
            list.add(num);

            while(list.size()>1){
                int a=list.get(list.size()-1);
                int b=list.get(list.size()-2);
                int gc=gcd(a,b);
                if(gc==1){
                    break;
                }
                list.remove(list.size()-1);
                list.remove(list.size()-1);
                long lcm=(long)a*b/gc;
                list.add((int)lcm);
            }
        }
        return list;
    }

    private int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}