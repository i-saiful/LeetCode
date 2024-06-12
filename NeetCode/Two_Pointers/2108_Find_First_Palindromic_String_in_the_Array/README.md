# 2108. Find First Palindromic String in the Array

- Problem: [https://leetcode.com](https://leetcode.com/problems/find-first-palindromic-string-in-the-array/)

### Approach-1: Iterative method
```python
class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        for w in words:
            l, r = 0, len(w) - 1
            while w[l] == w[r]:
                if l >= r:
                    return w
                l, r = l + 1, r - 1
        return ""
```

### Approach-2: Building Method
```python
class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        for w in words:
            if w == w[::-1]:
                return w
        return ""
```