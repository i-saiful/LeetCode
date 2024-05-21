# 1209. Remove All Adjacent Duplicates in String II

- Problem: [https://leetcode.com](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/)

```python
class Solution:
    def removeDuplicates(self, s: str, k: int) -> str:
        stack = []
        for c in s:
            if stack and stack[-1][0] == c:
                stack[-1][1] += 1
            else:
                stack.append([c, 1])
            if stack[-1][1] == k:
                stack.pop()

        res = ""
        for c, count in stack:
            res += c * count

        return res
```