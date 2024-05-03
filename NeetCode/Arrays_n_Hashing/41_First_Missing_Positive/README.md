# 41. First Missing Positive

- Problem: [https://leetcode.com](https://leetcode.com/problems/first-missing-positive/)

### Approach-1: Simple
```python
class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        numsSet = set(nums)
        i = 1
        while i in numsSet:
            i += 1
        return i
```

### Approach-2: More Complex
```python
class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        n = len(nums)
        for i in range(n):
            if nums[i] < 0:
                nums[i] = 0
        for i in range(n):
            val = abs(nums[i])
            if 1 <= val <= n:
                if nums[val - 1] > 0:
                    nums[val - 1] *= -1
                elif nums[val - 1] == 0:
                    nums[val - 1] = -1 * (n + 1)
        for i in range(1, n + 1):
            if nums[i - 1] >= 0:
                return i
        return n + 1
```