# 438. Find All Anagrams in a String

- Problem: [https://leetcode.com](https://leetcode.com/problems/find-all-anagrams-in-a-string/)

```python
class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        if len(p) > len(s): return []
        pCount, sCount = {}, {}
        for i in range(len(p)):
            pCount[p[i]] = 1 + pCount.get(p[i], 0)
            sCount[s[i]] = 1 + sCount.get(s[i], 0)
        res = [0] if pCount == sCount else []
        l = 0
        for r in range(len(p), len(s)):
            sCount[s[r]] = 1 + sCount.get(s[r], 0)
            sCount[s[l]] -= 1
            if sCount[s[l]] == 0:
                sCount.pop(s[l])
            l += 1
            if sCount == pCount:
                res.append(l)
        return res
```

### Approach-1: Optimize Code
```python
class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        idx = 0
        sMap, pMap = {}, {}
        res = []
        for char in p:
            pMap[char] = 1 + pMap.get(char, 0)
        for i in range(len(s)):
            sMap[s[i]] = 1 + sMap.get(s[i], 0)
            if i >= len(p) -1 :
                if sMap == pMap:
                    res.append(idx)
                if s[idx] in sMap:
                    sMap[s[idx]] -= 1
                    if sMap[s[idx]] == 0:
                        del sMap[s[idx]]
                idx += 1
        return res
```