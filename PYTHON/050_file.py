#First unique character
#method-1
name = "priyabharathi"
for i in name:
    if name.index(i) == name.rindex(i):
        print(i, "  ", name.index(i))
        break

#method-2
name = "hariharasudhan"
for ch in name:
    if name.count(ch) == 1:
        print(ch, "  ", name.index(ch))
        break

#method-3
name = "priyabharathi"
freq = {}
for ch in name:
    freq[ch] = freq.get(ch, 0) + 1
for i in name:
    if freq[i] == 1:
        print(i, "  ", name.index(i))
        break



nums = [5,7,7,8,8,10]
target = 8
if target not in nums:
    print([-1, -1])
else:
    print([nums.index(target), len(nums) - 1 - nums[::-1].index(target)])