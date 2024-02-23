# 620. Not Boring Movies

- Problem: [https://leetcode.com](https://leetcode.com/problems/not-boring-movies)

```sql
# Write your MySQL query statement below
SELECT
    *
FROM 
    Cinema
WHERE
    id % 2 = 1
    AND description != "boring"
ORDER BY
    rating DESC
```