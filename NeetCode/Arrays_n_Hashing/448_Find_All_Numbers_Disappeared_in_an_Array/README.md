# 448. Find All Numbers Disappeared in an Array

- Problem: [https://leetcode.com](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/)

```python
class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        for n in nums:
            i = abs(n) - 1
            nums[i] = -1 * abs(nums[i])
        res = []
        for i, n in enumerate(nums):
            if n > 0:
                res.append(i + 1)
        return res
```