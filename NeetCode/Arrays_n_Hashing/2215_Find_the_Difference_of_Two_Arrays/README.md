# 2215. Find the Difference of Two Arrays

- Problem: [https://leetcode.com](https://leetcode.com/problems/find-the-difference-of-two-arrays/)

```python
class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        nums1Set, nums2Set = set(nums1), set(nums2)
        res1, res2 = set(), set()

        for n in nums1Set:
            if n not in nums2Set:
                res1.add(n)

        for n in nums2Set:
            if n not in nums1Set:
                res2.add(n)

        return [list(res1), list(res2)]
```