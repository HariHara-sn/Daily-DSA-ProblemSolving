#MostCommonWord
import re
paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.".lower()
banned = ["hit","far"]
#op : ball

dmap = {}

for word in paragraph.split():
    word = re.sub("[^a-z\\s+]","",word)
    dmap[word] = dmap.get(word, 0) + 1

for bannedword in banned:
    dmap.pop(bannedword)

maxima = 0
res = ""
for k,v in dmap.items():
    if v == max(dmap.values()):
        print(k)
