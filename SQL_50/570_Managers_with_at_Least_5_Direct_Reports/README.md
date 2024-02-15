# 570. Managers with at Least 5 Direct Reports

- Problem: [https://leetcode.com](https://leetcode.com/problems/managers-with-at-least-5-direct-reports)

```sql
# Write your MySQL query statement below
SELECT
    E1.name
FROM
    Employee AS E1
JOIN
    Employee AS E2 ON
    E1.id = E2.managerId
GROUP BY
    E2.managerId
HAVING COUNT(*) >= 5;
```