class Solution {
    public boolean isSubsequence(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        // for(int i=0;i<len1;i++){
        //     char c=s.charAt(i);
        //     for(int j=0;i<len2;j++){
        //         char c2=s.charAt(j);
        //         if(c==c2){
        //             return true;
        //         }
        // }
        // if(i==len1){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        int i=0,j=0;
        while(i<len1 && j<len2){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==len1;
    }
}