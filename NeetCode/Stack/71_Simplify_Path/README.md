# 71. Simplify Path

- Problem: [https://leetcode.com](https://leetcode.com/problems/simplify-path/)

```python
class Solution:
    def simplifyPath(self, path: str) -> str:
        stack = []
        cur = ""
        for c in path + "/":
            if c == "/":
                if cur == "..": 
                    if stack: stack.pop()
                elif cur != "" and cur != ".": 
                    stack.append(cur)
                cur = ""
            else:
                cur += c

        return "/" + "/".join(stack)
```