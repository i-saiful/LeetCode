# 394. Decode String

- Problem: [https://leetcode.com](https://leetcode.com/problems/decode-string/)

```python
class Solution:
    def decodeString(self, s: str) -> str:
        stack = []
        for c in s:
            if c is not "]":
                stack.append(c)
            else:
                subStr = ""
                while stack[-1] is not "[":
                    subStr = stack.pop() + subStr
                stack.pop()

                multiplier = ""
                while stack and stack[-1].isdigit():
                    multiplier = stack.pop() + multiplier
                
                stack.append(int(multiplier) * subStr)
        return "".join(stack)
```