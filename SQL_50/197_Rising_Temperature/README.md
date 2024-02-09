# 197. Rising Temperature

- Problem: [https://leetcode.com](https://leetcode.com/problems/rising-temperature)

### Approach 1
```sql
# Write your MySQL query statement below
SELECT
    Q2.id
FROM
    Weather AS Q1,
    Weather AS Q2
WHERE
    DATEDIFF(Q2.recordDate, Q1.recordDate) = 1
    AND Q2.temperature > Q1.temperature
```

### Approach 2
```sql
# Write your MySQL query statement below
SELECT
    Q2.id
FROM
    Weather AS Q1
JOIN
    Weather AS Q2
WHERE
    DATEDIFF(Q2.recordDate, Q1.recordDate) = 1
    AND Q2.temperature > Q1.temperature
```