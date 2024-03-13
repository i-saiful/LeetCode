# 242. Valid Anagram

- Problem: [https://leetcode.com](https://leetcode.com/problems/valid-anagram)

## Approach 1: Using Hashing Technique
```python
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        counterS, counterT = {}, {}
        for i in range(len(s)):
            counterS[s[i]] = 1 + counterS.get(s[i], 0)
            counterT[t[i]] = 1 + counterT.get(t[i], 0)
        
        for c in counterS:
            if counterS[c] != counterT.get(c, 0):
                return False
        return True
```
## Approach 2: Using Counter Function
```python
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return Counter(s) == Counter(t)
```

## Approach 3: Using Sorted Function
```python
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return sorted(s) == sorted(t)
```