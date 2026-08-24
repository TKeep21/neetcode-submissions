class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> dict_s = new HashMap<>();
        Map<Character,Integer> dict_t = new HashMap<>();

        for (Character i:s.toCharArray()){
            dict_s.put(i,dict_s.getOrDefault(i, 0) + 1);
        }
        for (Character i:t.toCharArray()){
            dict_t.put(i,dict_t.getOrDefault(i, 0) + 1);
        }
        return (dict_s.equals(dict_t));
    }

}

/* class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        dict_s = dict()
        dict_t = dict()

        for i in range(len(s)):
            dict_s[s[i]] = dict_s.get(s[i],0) + 1
        for i in range(len(t)):
            dict_t[t[i]] = dict_t.get(t[i],0) + 1
        return dict_s == dict_t
        */