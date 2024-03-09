# Write your MySQL query statement below
SELECT
    CASE
        WHEN MOD(id, 2) = 0 THEN id - 1
        WHEN id = (SELECT COUNT(*) FROM Seat) THEN id
        ELSE id + 1
    END AS id,
    student
FROM
    Seat
ORDER BY
    id