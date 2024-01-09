# 350. Intersection of Two Arrays II

- Problem: [https://leetcode.com](https://leetcode.com/problems/intersection-of-two-arrays-ii)

```py
class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        if len(nums1) > len(nums2): return self.intersect(nums2, nums1)
        hash = Counter(nums1)
        result = []
        for i in nums2:
            if hash[i] > 0:
                result.append(i)
                hash[i] -= 1
        return result
```