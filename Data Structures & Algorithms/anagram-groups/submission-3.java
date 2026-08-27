class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();

        for (String i: strs){
            char[] chars = i.toCharArray();
            Arrays.sort(chars);
            String srted = new String(chars);

            if (!res.containsKey(srted)){
                res.put(srted, new ArrayList<>());
            }

            res.get(srted).add(i);

        }
        return new ArrayList<>(res.values());
    }
}
