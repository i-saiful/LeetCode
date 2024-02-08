# 1378. Replace Employee ID With The Unique Identifier

- Problem: [https://leetcode.com](https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier)

```sql
# Write your MySQL query statement below
SELECT
    unique_id,
    name
FROM
    Employees
LEFT JOIN
    EmployeeUNI ON
    Employees.id = EmployeeUNI.id
```