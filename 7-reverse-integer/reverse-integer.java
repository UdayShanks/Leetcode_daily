class Solution {
    public int reverse(int x) {
        int res=0;
        boolean isNegative=x<0;
        String s=String.valueOf(Math.abs(x));
        StringBuilder sb=new StringBuilder(s).reverse();

        try{
            res=Integer.parseInt(sb.toString());

        }catch (NumberFormatException e){
            return 0;
        }

        return isNegative ? -res:res;
    }
}