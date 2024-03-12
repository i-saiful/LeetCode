# 196. Delete Duplicate Emails

- Problem: [https://leetcode.com](https://leetcode.com/problems/delete-duplicate-emails)

```sql
# Write your MySQL query statement below
DELETE
    P1
FROM
    Person AS P1
JOIN
    Person AS P2
WHERE
    P1.id > P2.id
    AND p1.email = p2.email
```