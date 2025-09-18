class Solution {
    public String convertDateToBinary(String date) {
        String[] words=date.split("-");
        int len=words.length;
        int[] arr=new int[len];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            arr[i]=Integer.parseInt(words[i]);
            sb.append(Integer.toBinaryString(arr[i]));
            if(i<len-1){
                sb.append("-");
            }
        }
        return sb.toString();
    }
}