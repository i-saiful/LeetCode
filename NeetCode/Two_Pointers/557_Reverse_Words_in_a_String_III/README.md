# 557. Reverse Words in a String III

- Problem: [https://leetcode.com](https://leetcode.com/problems/reverse-words-in-a-string-iii/)

```python
class Solution:
    def reverseWords(self, s: str) -> str:
        s = list(s)
        l = 0
        for r in range(len(s)):
            if s[r] == ' ' or r == len(s) - 1:
                temp_l, temp_r = l, r - 1
                if r == len(s) - 1:
                    temp_r = r
                while temp_l < temp_r:
                    s[temp_l], s[temp_r] = s[temp_r], s[temp_l]
                    temp_l += 1
                    temp_r -= 1
                l = r + 1
        return "".join(s)
```
Split above code
```python
class Solution:
    def reverseWords(self, s: str) -> str:
        l = 0
        res = ""
        for r in range(len(s)):
            if r == len(s) - 1:
                res += self.swap(s[l: r + 1])
            elif s[r] == ' ':
                res += self.swap(s[l:r]) + " "
                l = r + 1
        return res

    def swap(self, s: str) -> str:
        s = list(s)
        l, r = 0, len(s) - 1
        while l < r:
            s[l], s[r] = s[r], s[l]
            l += 1
            r -= 1
        return "".join(s)
```