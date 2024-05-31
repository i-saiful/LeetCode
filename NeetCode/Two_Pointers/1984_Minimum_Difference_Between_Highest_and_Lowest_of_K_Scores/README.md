# 1984. Minimum Difference Between Highest and Lowest of K Scores

- Problem: [https://leetcode.com](https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/)

```python
class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        nums.sort()
        l, r = 0, k - 1
        res = float("inf")
        while r < len(nums):
            res = min(res, nums[r] - nums[l])
            l, r = l + 1, r + 1
        return res
```