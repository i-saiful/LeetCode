# 1929. Concatenation of Array

- Problem: [https://leetcode.com](https://leetcode.com/problems/concatenation-of-array)

```python
class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans = []
        
        for i in range(2):
            for n in nums:
                ans.append(n)
        return ans
```