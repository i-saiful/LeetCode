# 1667. Fix Names in a Table

- Problem: [https://leetcode.com](https://leetcode.com/problems/fix-names-in-a-table)

```sql
# Write your MySQL query statement below
SELECT
    user_id,
    CONCAT(UPPER(LEFT(name, 1)), LCASE(SUBSTRING(name, 2))) AS name
FROM
    Users
ORDER BY
    user_id
```