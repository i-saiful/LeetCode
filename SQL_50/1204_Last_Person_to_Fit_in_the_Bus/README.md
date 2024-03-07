# 1204. Last Person to Fit in the Bus

- Problem: [https://leetcode.com](https://leetcode.com/problems/last-person-to-fit-in-the-bus)

## Approach 1
```sql
# Write your MySQL query statement below
SELECT person_name
FROM (
    SELECT
        person_name,
        SUM(weight) OVER (ORDER BY turn) AS total_weight,turn
    FROM Queue
) AS cumulative_weight
WHERE 
    total_weight <= 1000
ORDER BY 
    turn DESC
LIMIT 
    1
```

## Approach 2
```sql
# Write your MySQL query statement below
SELECT
    Q1.person_name
FROM
    Queue AS Q1
JOIN
    Queue AS Q2 ON
    Q1.turn >= Q2.turn
GROUP BY
    Q1.turn
HAVING
    SUM(Q2.weight) <= 1000
ORDER BY
    SUM(Q2.weight) DESC
LIMIT
    1
```

## Approach 3
```sql
# Write your MySQL query statement below
SELECT
    person_name
FROM
    Queue AS Q
WHERE
    1000 >= (
        SELECT 
            SUM(weight)
        FROM
            Queue
        WHERE
            Q.turn >= turn
    )
ORDER BY
    turn DESC
LIMIT
    1
```