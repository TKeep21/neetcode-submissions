class Solution {
    public int[] productExceptSelf(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int zeros = 0;
        int zero_ind = 0;
        int mult = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros += 1;
                zero_ind = i;
                continue;
            } else {
                mult *= nums[i];
            }
        }

        if (zeros > 1) {
            int[] zeros_arr = new int[nums.length];
            return zeros_arr;
        } else if (zeros == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (i == zero_ind) {
                    res.add(mult);
                } else{
                    res.add(0);
                }
            }
        } else if (zeros == 0) {
            for (int i = 0; i < nums.length; i++) {
                res.add(mult/nums[i]);
            }
        }
        int[] arr = res.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}
