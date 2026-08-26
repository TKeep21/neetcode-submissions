class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<nums.length;i++){
            set.add(nums[i]);
        }
        Integer nums_l = nums.length;
        Integer set_l = set.size();
        if (nums_l.equals(set_l)){
            return false;
        }else{
            return true;
        }
}
}