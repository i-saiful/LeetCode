# 2405. Optimal Partition of String

- Problem: [https://leetcode.com](https://leetcode.com/problems/optimal-partition-of-string/)

```python
class Solution:
    def partitionString(self, s: str) -> int:
        curSet = set()
        res = 1
        for c in s:
            if c in curSet:
                res +=1
                curSet = set()
            curSet.add(c)
        return res
```