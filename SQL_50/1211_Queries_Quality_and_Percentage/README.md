# 1211. Queries Quality and Percentage

- Problem: [https://leetcode.com](https://leetcode.com/problems/queries-quality-and-percentage)

```sql
# Write your MySQL query statement below
SELECT
    query_name,
    ROUND(AVG(rating / position), 2) AS quality,
    ROUND(SUM(IF(rating < 3, 100, 0)) / COUNT(*), 2) AS poor_query_percentage
FROM
    Queries
WHERE
    query_name IS NOT NULL
GROUP BY
    query_name
```