# 1768. Merge Strings Alternately

- Problem: [https://leetcode.com](https://leetcode.com/problems/merge-strings-alternately/)

```python
class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        i = j = 0
        res = []
        while i < len(word1) and j < len(word2):
            res.append(word1[i])
            res.append(word2[j])
            i += 1
            j += 1
        res.append(word1[i:])
        res.append(word2[j:])
        return "".join(res)
```