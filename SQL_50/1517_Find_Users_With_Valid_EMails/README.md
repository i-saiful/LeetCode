# 1517. Find Users With Valid EMails

- Problem: [https://leetcode.com](https://leetcode.com/problems/find-users-with-valid-e-mails)

```sql
# Write your MySQL query statement below
SELECT
    *
FROM
    Users
WHERE
    mail REGEXP '^[A-Za-z][A-Za-z0-9_\.\-]*@leetcode\\.com$'
```