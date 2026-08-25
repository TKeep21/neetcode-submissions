class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> hasDup = new HashMap<>();
        boolean flag = false;
        for (int i=0;i<nums.length;i++){
            hasDup.put(nums[i],hasDup.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer i:hasDup.values()){
            if (i > 1){
                flag = true;
            }
        }
        return flag;

    }
}