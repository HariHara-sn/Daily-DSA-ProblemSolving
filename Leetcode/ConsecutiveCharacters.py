class Solution:
    def maxPower(self, s: str) -> int:
        max_power = ""
        current = ""
        for i in range(1, len(s)):
            if s[i - 1] == s[i]:
                current += s[i]
            else:
                current = s[i]
            if len(current) > len(max_power):
                max_power = current
                
        return max_power
    
Solution().maxPower("leetcode")  # "ee"