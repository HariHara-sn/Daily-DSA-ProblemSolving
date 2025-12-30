#MostCommonWord
#dict
import re
paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.".lower()
banned = ["hit","far"]
dmap = {}
for word in paragraph.split():
    word = re.sub("[^a-z\\s]+","",word)
    if word not in dmap:
        dmap[word] = 0
    else:
        dmap[word] += 1

# for word in re.sub("[^a-z \\s]+"," ",paragraph).split():  short hand of above loop
#     dmap[word] = dmap.get(word, 0) + 1

for bannedword in banned:
    dmap.pop(bannedword)
print(dmap)
for k,v in dmap.items():
    if v == max(dmap.values()):
        print(k)