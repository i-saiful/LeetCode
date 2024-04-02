# 28. Find the Index of the First Occurrence in a String

- Problem: [https://leetcode.com](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)

```python
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if needle == "": return 0
        lps = [0] * len(needle)
        preLPS, i = 0, 1
        while i < len(needle):
            if needle[i] == needle[preLPS]:
                lps[i] = preLPS + 1
                preLPS += 1
                i += 1
            elif preLPS == 0:
                lps[i] = 0
                i += 1
            else:
                preLPS = lps[preLPS - 1]
        i, j = 0, 0
        while i < len(haystack):
            if haystack[i] == needle[j]:
                i, j = i + 1, j + 1
            else:
                if j == 0:
                    i += 1
                else:
                    j = lps[j - 1]
            if j == len(needle):
                return i - len(needle)
        return -1
```