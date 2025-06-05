class Twosum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> so=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        int mu=target-nums[i];

        if(so.containsKey(mu)){
            return new int[]{so.get(mu),i};
        }
        so.put(nums[i],i);

        }
        return new int[2];
    }
}
