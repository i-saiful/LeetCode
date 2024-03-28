# 1189. Maximum Number of Balloons

- Problem: [https://leetcode.com](https://leetcode.com/problems/maximum-number-of-balloons/)

```python
class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        countText = Counter(text)
        ballon = Counter("balloon")
        res = len(text)
        for c in ballon:
            res = min(res, countText[c] // ballon[c])
        return res
```