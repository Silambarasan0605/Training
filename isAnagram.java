class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a=new int[26];

        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            ++a[s.charAt(i)-97];

            --a[t.charAt(i)-97];
        }
        for(int nu:a){
            if(nu!=0){
                return false;
            }
        }
        return true;
    }
}
