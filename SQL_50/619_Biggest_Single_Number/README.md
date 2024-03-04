# 619. Biggest Single Number

- Problem: [https://leetcode.com](https://leetcode.com/problems/biggest-single-number)

```sql
# Write your MySQL query statement below
SELECT
    MAX(num) AS num
FROM
    MyNumbers
WHERE
    num IN (
        SELECT
            num
        FROM
            MyNumbers
        GROUP BY
            num
        HAVING
            COUNT(num) = 1
    )
```