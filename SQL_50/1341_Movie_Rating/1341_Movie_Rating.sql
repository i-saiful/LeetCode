# Write your MySQL query statement below
(SELECT
    name AS results
FROM
    MovieRating AS MR
JOIN
    Users AS U ON
    U.user_id = MR.user_id
GROUP BY
    name
ORDER BY
    COUNT(*) DESC,
    name
LIMIT
    1)
UNION ALL
(SELECT
    title AS results
FROM
    MovieRating AS MR
JOIN
    Movies AS M ON
    MR.movie_id = M.movie_id
WHERE
    DATE_FORMAT(created_at,"%Y-%m") = "2020-02"
GROUP BY
    title
ORDER BY
    AVG(rating) DESC,
    title
LIMIT
    1)