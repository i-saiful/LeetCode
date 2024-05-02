# 2483. Minimum Penalty for a Shop

- Problem: [https://leetcode.com](https://leetcode.com/problems/minimum-penalty-for-a-shop/)

```python
class Solution:
    def bestClosingTime(self, customers: str) -> int:
        n = len(customers)
        prefix = [0] * (n + 1)
        postfix = [0] * (n + 1)
        
        for i in range(1, n + 1):
            prefix[i] = prefix[i - 1]
            if customers[i - 1] == "N":
                prefix[i] += 1
        for i in range(n - 1, -1, -1):
            postfix[i] = postfix[i + 1]
            if customers[i] == "Y":
                postfix[i] += 1
        min_penalty, idx = float("inf"), 0
        for i in range(n + 1):
            penalty = prefix[i] + postfix[i]
            if penalty < min_penalty:
                min_penalty = penalty
                idx = i
        return idx
```