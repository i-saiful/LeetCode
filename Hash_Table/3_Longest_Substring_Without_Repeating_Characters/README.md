# 3. Longest Substring Without Repeating Characters

- Problem: [https://leetcode.com](https://leetcode.com/problems/longest-substring-without-repeating-characters)

```python
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        charSet = set()
        l = 0
        res = 0
        
        for i in range(len(s)):
            while s[i] in charSet:
                charSet.remove(s[l])
                l += 1
            charSet.add(s[i])
            res = max(res, i - l + 1)
        return res
```