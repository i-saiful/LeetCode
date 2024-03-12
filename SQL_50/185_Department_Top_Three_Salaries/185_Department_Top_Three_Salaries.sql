# Write your MySQL query statement below
SELECT
    D.name AS "Department",
    E1.name AS "Employee",
    salary
FROM
    Employee AS E1
JOIN
    Department AS D ON
    E1.departmentId = D.id
WHERE
    3 > (
        SELECT
            COUNT(DISTINCT E2.salary)
        FROM
            Employee AS E2
        WHERE
            E2.salary > E1.salary
            AND E1.departmentId = E2.departmentId
    )