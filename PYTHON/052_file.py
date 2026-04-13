# sort them based on freq
words = ["apple", "banana", "apple", "orange", "banana", "apple"]

dmap = {}

for word in words:
    dmap[word] = dmap.get(word, 0) + 1

sorted_by_freq = sorted(dmap.items(), key=lambda x : x, reverse=True)

for word in sorted_by_freq:
    print(" ".join(map(str, word)))