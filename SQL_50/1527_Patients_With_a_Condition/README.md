# 1527. Patients With a Condition

- Problem: [https://leetcode.com](https://leetcode.com/problems/patients-with-a-condition)

```sql
# Write your MySQL query statement below
SELECT
    *
FROM
    Patients
WHERE
    conditions LIKE "DIAB1%"
    OR conditions LIKE "% DIAB1%"
```
