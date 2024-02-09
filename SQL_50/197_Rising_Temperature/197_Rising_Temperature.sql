# Write your MySQL query statement below
SELECT
    Q2.id
FROM
    Weather AS Q1,
    Weather AS Q2
WHERE
    DATEDIFF(Q2.recordDate, Q1.recordDate) = 1
    AND Q2.temperature > Q1.temperature