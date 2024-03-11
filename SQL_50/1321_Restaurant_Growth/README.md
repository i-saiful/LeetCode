# 1321. Restaurant Growth

- Problem: [https://leetcode.com](https://leetcode.com/problems/restaurant-growth)

```sql
# Write your MySQL query statement below
WITH DaySum AS (
    SELECT
        visited_on,
        SUM(amount) AS amount
    FROM
        Customer
    GROUP BY
        visited_on
)
SELECT
    D1.visited_on,
    SUM(D2.amount) AS amount,
    ROUND(AVG(D2.amount), 2) AS average_amount
FROM
    DaySum AS D1,
    DaySum AS D2
WHERE
    DATEDIFF(D1.visited_on, D2.visited_on) BETWEEN 0 AND 6
GROUP BY
    D1.visited_on
HAVING
    COUNT(*) > 6
ORDER BY
    D1.visited_on
```