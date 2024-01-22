# 771. Jewels and Stones

- Problem: [https://leetcode.com](https://leetcode.com/problems/jewels-and-stones)

```python
class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        jewelsCount = {}
        
        for stone in stones:
            if stone in jewels and stone in jewelsCount:
                jewelsCount[stone] += 1
            elif stone in jewels:
                jewelsCount[stone] = 1
        return sum(jewelsCount.values())
```