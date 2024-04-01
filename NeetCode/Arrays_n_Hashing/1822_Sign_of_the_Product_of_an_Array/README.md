# 1822. Sign of the Product of an Array

- Problem: [https://leetcode.com](https://leetcode.com/problems/sign-of-the-product-of-an-array/)

```python
class Solution:
    def arraySign(self, nums: List[int]) -> int:
        neg = 0
        for n in nums:
            if n == 0:
                return 0
            neg += (1 if n < 0 else 0)
        return -1 if neg % 2 else 1
```