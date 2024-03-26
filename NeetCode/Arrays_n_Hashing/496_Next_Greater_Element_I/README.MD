# 496. Next Greater Element I

- Problem: [https://leetcode.com](https://leetcode.com/problems/next-greater-element-i/)

### Approach-1: Hashing
Time Complexity : O(m * n)
```python
class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        numsIdx = {n:i for i, n in enumerate(nums1)}
        res = [-1] * len(nums1)
        for i in range(len(nums2)):
            if nums2[i] not in numsIdx:
                continue
            for j in range(i + 1, len(nums2)):
                if nums2[j] > nums2[i]:
                    idx = numsIdx[nums2[i]]
                    res[idx] = nums2[j]
                    break
        return res
```

### Approach-2: Monotonic Stack
Time Complexity : O(m + n)
```python
class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        numsIdx = {n:i for i, n in enumerate(nums1)}
        res = [-1] * len(nums1)
        stack = []
        
        for i in range(len(nums2)):
            cur = nums2[i]
            while stack and cur > stack[-1]:
                val = stack.pop()
                idx = numsIdx[val]
                res[idx] = cur
            if cur in numsIdx:
                stack.append(cur)
                
        return res
```