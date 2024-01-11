# 219. Contains Duplicate II

- Problem: [https://leetcode.com](https://leetcode.com/problems/contains-duplicate-ii/)

```python
class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        window = set()
        L = 0
        
        for R in range(len(nums)):
            if R - L > k:
                window.remove(nums[L])
                L += 1
            if nums[R] in window:
                return True
            window.add(nums[R])
        return False
```