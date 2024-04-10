# 1963. Minimum Number of Swaps to Make the String Balanced

- Problem: [https://leetcode.com](https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/)

```python
class Solution:
    def minSwaps(self, s: str) -> int:
        close, maxClose = 0, 0
        for c in s:
            if c == '[':
                close -= 1
            else:
                close += 1
            maxClose = max(maxClose, close)
        return (maxClose + 1) // 2
```