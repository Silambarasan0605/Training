class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=0;
        int product=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                continue;
            }
            product*=nums[i];
        }

        for(int i=0;i<nums.length;i++){

                if(nums[i]==0){

                            if(count>1){
                                    nums[i]=0;
                                    continue;
                            }
                            else {
                                    nums[i]=product;
                                    continue;
                            }
                }
                else if(count>0){
                        nums[i]=0;
                        continue;
                }

            nums[i]=product/nums[i];
        }
        return nums;

    }
}
