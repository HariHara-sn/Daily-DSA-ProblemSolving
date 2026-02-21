# First Unique Character in a String
def method1(s):
    for ch in s:
        if s.index(ch) == s.rindex(ch):
            return s.index(ch)
    return -1

def method2(s):
    freq = {}
    for ch in s:
        freq[ch] = freq.get(ch, 0) + 1

    for i, ch in enumerate(s):
        if freq[ch] == 1:
            return i
    return -1

m1 = method1("loveleetcode")
m2 = method2("loveleetcode")
print(m1)