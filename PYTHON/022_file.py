# 49. Group Anagrams
strs = ["eat","tea","tan","ate","nat","bat"]
map = {}
for word in strs:
    freq = [0] * 26
    for ch in word:
        freq[ord(ch) - ord('a')] += 1
    key = str(freq)
    if key in map:
        map[key].append(word)
    else:
        map[key] = [word]

n_list = list(map.values())


print(n_list)
print(map)
