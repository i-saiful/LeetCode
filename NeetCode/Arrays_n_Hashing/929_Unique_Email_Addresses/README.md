# 929. Unique Email Addresses

- Problem: [https://leetcode.com](https://leetcode.com/problems/unique-email-addresses)

### Approach Linear Iteration
```python
class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        unique = set()
        for e in emails:
            i, local = 0, ""
            while e[i] not in ("@", "+"):
                if e[i] != ".":
                    local += e[i]
                i += 1
            while e[i] != "@":
                i += 1
            domain = e[i + 1:]
            unique.add((local, domain))
        return len(unique)
```

### Approach Built-in Function
```python
class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        unique = set()
        for e in emails:
            local, domain = e.split("@")
            local = local.split("+")[0]
            local = local.replace(".", "")
            unique.add((local, domain))
        return len(unique)
```