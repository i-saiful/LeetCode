# 2390. Removing Stars From a String

- Problem: [https://leetcode.com](https://leetcode.com/problems/removing-stars-from-a-string/)

```python
class Solution:
    def removeStars(self, s: str) -> str:
        stack = []
        for c in s:
            if c == "*":
                stack and stack.pop()
            else:
                stack.append(c)
        return "".join(stack)
```