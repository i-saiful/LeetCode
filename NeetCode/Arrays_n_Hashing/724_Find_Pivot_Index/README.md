# 724. Find Pivot Index

- Problem: [https://leetcode.com](https://leetcode.com/problems/find-pivot-index/)

```python
class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        total = sum(nums)

        leftSum = 0
        for i in range(len(nums)):
            rightSum = total - nums[i] - leftSum
            if rightSum == leftSum:
                return i
            leftSum += nums[i]
        
        return -1
```