# 217. Contains Duplicate

- Problem: [https://leetcode.com](https://leetcode.com/problems/contains-duplicate)

```python
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        hashset = set()
        for i in nums:
            if i in hashset:
                return True
            hashset.add(i)
        return False
```