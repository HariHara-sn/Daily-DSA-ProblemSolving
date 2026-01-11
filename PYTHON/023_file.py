# 383. Ransom Note
ransomNote = "aab"
magazine = "baa"
freq = [0] * 26
for ch in magazine:
    freq[ord(ch) - ord('a')] += 1
for ch in ransomNote:
    if freq[ord(ch) - ord('a')] == 0:
        print(False)
        break
    freq[ord(ch) - ord('a')] -= 1
print(True)
    