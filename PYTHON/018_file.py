# 49. Group Anagrams
from typing import List  # <-- add this 


def groupAnagrams(strs: List[str]) -> List[List[str]]:
    map = {}  # key: frequency signature, value: list of anagrams

    for word in strs:
        freq = [0] * 26
        for c in word:
            freq[ord(c) - ord('a')] += 1

        key = str(freq)

        if key not in map:
            map[key] = []
        map[key].append(word)

    return list(map.values())

strs = ["eat","tea","tan","ate","nat","bat"]
print(groupAnagrams(strs))  
