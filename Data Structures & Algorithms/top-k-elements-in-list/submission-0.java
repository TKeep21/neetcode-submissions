class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> freq = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer> keysList = freq.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).map(Map.Entry::getKey).toList();
        int[] res = new int[k];
        for (int i=0; i<k;i++){
            res[i] = keysList.get(i);
        }
        Arrays.sort(res); 
        return res;
        
        
    }
}
