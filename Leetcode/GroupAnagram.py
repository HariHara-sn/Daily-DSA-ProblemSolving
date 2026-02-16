#Group Anagrams
strs = ["eat","tea","tan","ate","nat","bat"]
#output :  [['eat', 'tea', 'ate'], ['tan', 'nat'], ['bat']]

wordfreq = [0] * 26
group_freq = {}
for word in strs:
    for ch in word:
        wordfreq[ord(ch) - ord('a')] += 1
    key = str(wordfreq)
    group_freq[key] = group_freq.get(key, []) + [word]
    wordfreq = [0] * 26 # reset

print(list(group_freq.values()))