# 602. Friend Requests II: Who Has the Most Friends

- Problem: [https://leetcode.com](https://leetcode.com/problems/friend-requests-ii-who-has-the-most-friends)

```sql
# Write your MySQL query statement below
WITH all_ids AS (
    SELECT
        requester_id AS ID
    FROM
        RequestAccepted
    UNION ALL
    SELECT
        accepter_id AS ID
    FROM
        RequestAccepted
)
SELECT
    id,
    COUNT(id) AS num
FROM
    all_ids
GROUP BY
    id
ORDER BY
    COUNT(id) DESC
LIMIT
    1
```