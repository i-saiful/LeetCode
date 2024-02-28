# 550. Game Play Analysis IV

- Problem: [https://leetcode.com](https://leetcode.com/problems/game-play-analysis-iv)

```sql
# Write your MySQL query statement below
SELECT
    ROUND(COUNT(A.player_id) / (SELECT COUNT(DISTINCT A3.player_id) FROM Activity AS A3), 2) AS fraction
FROM
    Activity AS A
WHERE
    (A.player_id, DATE_SUB(event_date, INTERVAL 1 DAY)) IN (
        SELECT
            A2.player_id,
            MIN(A2.event_date) 
        FROM 
            Activity AS A2
        GROUP BY
            A2.player_id
    )
```