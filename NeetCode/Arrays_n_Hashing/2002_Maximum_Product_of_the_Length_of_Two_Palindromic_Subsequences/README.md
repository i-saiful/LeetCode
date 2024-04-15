# 2002. Maximum Product of the Length of Two Palindromic Subsequences

- Problem: [https://leetcode.com](https://leetcode.com/problems/maximum-product-of-the-length-of-two-palindromic-subsequences/)

```python
class Solution:
    def maxProduct(self, s: str) -> int:
        n, pali = len(s), {}
        for mask in range(1, 1 << n):
            subseq = ""
            for i in range(n):
                if mask & (1 << i):
                    subseq += s[i]
            if subseq == subseq[::-1]:
                pali[mask] = len(subseq)
        res = 0
        for m1 in pali:
            for m2 in pali:
                if m1 & m2 == 0:
                    res = max(res, pali[m1] * pali[m2])
        return res
```