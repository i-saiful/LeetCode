# 1461. Check If a String Contains All Binary Codes of Size K

- Problem: [https://leetcode.com](https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/)

```python
class Solution:
    def hasAllCodes(self, s: str, k: int) -> bool:
        codeSet = set()
        for i in range(len(s) - k + 1):
            codeSet.add(s[i: i + k])
        return len(codeSet) == 2 ** k
```