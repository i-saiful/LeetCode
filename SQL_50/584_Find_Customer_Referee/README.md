# 584. Find Customer Referee

- Problem: [https://leetcode.com](https://leetcode.com/problems/find-customer-referee)

```sql
# Write your MySQL query statement below
SELECT
    name
FROM
    Customer
WHERE
    referee_id != 2
    OR referee_id IS NULL;
```