strs = ["eat","tea","tan","ate","nat","bat"]
#output :  [['eat', 'tea', 'ate'], ['tan', 'nat'], ['bat']]

wordfreq = [0] * 26
groupfreq = {}
for word in strs:
    for ch in word:
        wordfreq[ord(ch) - ord('a')] += 1
    groupfreq[str(wordfreq)] = groupfreq.get(str(wordfreq), []) + [word]
    wordfreq = [0] * 26 # reset

print(list(groupfreq.values()))