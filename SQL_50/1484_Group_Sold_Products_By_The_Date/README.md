# 1484. Group Sold Products By The Date

- Problem: [https://leetcode.com](https://leetcode.com/problems/group-sold-products-by-the-date)

```sql
# Write your MySQL query statement below
SELECT
    sell_date,
    COUNT(DISTINCT product) AS num_sold,
    GROUP_CONCAT(DISTINCT product) AS products
FROM
    Activities
GROUP BY
    sell_date
```