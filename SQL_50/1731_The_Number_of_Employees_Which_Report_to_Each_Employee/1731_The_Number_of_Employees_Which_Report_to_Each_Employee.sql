# Write your MySQL query statement below
SELECT
    E.employee_id,
    E.name,
    COUNT(M.reports_to) AS reports_count,
    ROUND(AVG(M.age)) AS average_age
FROM
    Employees AS E
INNER JOIN
    Employees AS M ON
    E.employee_id = M.reports_to
GROUP BY
    E.employee_id
ORDER BY
    E.employee_id