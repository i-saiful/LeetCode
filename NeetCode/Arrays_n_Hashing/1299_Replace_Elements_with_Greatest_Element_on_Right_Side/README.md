# 1299. Replace Elements with Greatest Element on Right Side

- Problem: [https://leetcode.com](https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side)

```python
class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        rightMax = -1
        for i in range(len(arr) - 1, -1, -1):
            newMax = max(rightMax, arr[i])
            arr[i] = rightMax
            rightMax = newMax
        return arr
```