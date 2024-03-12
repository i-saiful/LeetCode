# 76. Second Highest Salary

- Problem: [https://leetcode.com](https://leetcode.com/problems/second-highest-salary)

```sql
# Write your MySQL query statement below
SELECT
    MAX(salary) AS "SecondHighestSalary"
FROM
    Employee
WHERE
    salary < (SELECT MAX(salary) FROM Employee)
```