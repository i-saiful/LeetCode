# Write your MySQL query statement below
DELETE
    P1
FROM
    Person AS P1
JOIN
    Person AS P2
WHERE
    P1.id > P2.id
    AND p1.email = p2.email