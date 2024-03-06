# 610. Triangle Judgement

- Problem: [https://leetcode.com](https://leetcode.com/problems/triangle-judgement)

```sql
# Write your MySQL query statement below
SELECT
    *,
    CASE
        WHEN x + y > z AND y + z > x AND x + z > y THEN "Yes"
        ELSE "No"
    END AS triangle
FROM
    Triangle
```