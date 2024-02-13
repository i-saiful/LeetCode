# 577. Employee Bonus

- Problem: [https://leetcode.com](https://leetcode.com/problems/employee-bonus)

```sql
# Write your MySQL query statement below
SELECT
    Employee.name,
    Bonus.bonus
FROM
    Employee
LEFT JOIN
    Bonus ON
    Employee.empId = Bonus.empId
WHERE
    Bonus.bonus < 1000
    OR Bonus.bonus IS NULL;
```