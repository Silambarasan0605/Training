class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expect=(n*(n+1))/2;
        int pr=0;
        for(int x:nums){
            pr+=x;
        }
        return expect-pr;
    }
}
