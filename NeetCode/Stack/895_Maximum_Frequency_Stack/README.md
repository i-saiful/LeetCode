# 895. Maximum Frequency Stack

- Problem: [https://leetcode.com](https://leetcode.com/problems/maximum-frequency-stack/)

```python
class FreqStack:

    def __init__(self):
        self.count = {}
        self.maxCount = 0
        self.stack = {}

    def push(self, val: int) -> None:
        valCount = 1 + self.count.get(val, 0)
        self.count[val] = valCount
        if valCount > self.maxCount:
            self.maxCount = valCount
            self.stack[valCount] = []
        self.stack[valCount].append(val)

    def pop(self) -> int:
        res = self.stack[self.maxCount].pop()
        self.count[res] -= 1
        if not self.stack[self.maxCount]:
            self.maxCount -= 1
        return res


# Your FreqStack object will be instantiated and called as such:
# obj = FreqStack()
# obj.push(val)
# param_2 = obj.pop()
```