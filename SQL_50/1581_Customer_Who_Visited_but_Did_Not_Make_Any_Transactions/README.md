# 1581. Customer Who Visited but Did Not Make Any Transactions

- Problem: [https://leetcode.com](https://leetcode.com/problems/customer-who-visited-but-did-not-make-any-transactions)

```sql
# Write your MySQL query statement below
SELECT
    customer_id,
    COUNT(visit_id) AS count_no_trans
FROM
    Visits
WHERE
    visit_id NOT IN (
        SELECT
            visit_id
        FROM
            Transactions
    )
GROUP BY
    customer_id
```