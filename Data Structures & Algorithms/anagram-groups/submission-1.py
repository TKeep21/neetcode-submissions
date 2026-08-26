class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = dict()
        for i in strs:
            srted ="".join(sorted(i)) 
            if srted not in anagrams:
                anagrams[srted] = []
            anagrams[srted].append(i)
        return list(anagrams.values())