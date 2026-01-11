# 771. Jewels and Stones
jewels = "aA"
stones = "aAAbbbb"
map = {}
count = 0
for ch in jewels:
    map[ch] = 0
for ch in stones:
    if ch in map:
        map[ch] += 1 
        count += 1
    
print(map , " Count: " , count)