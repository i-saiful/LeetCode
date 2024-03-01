# 1141. User Activity for the Past 30 Days I

- Problem: [https://leetcode.com](https://leetcode.com/problems/user-activity-for-the-past-30-days-i)

```sql
# Write your MySQL query statement below
SELECT
    activity_date AS day,
    COUNT(DISTINCT user_id) AS active_users
FROM
    Activity
WHERE
    DATEDIFF('2019-07-27', activity_date) < 30 AND DATEdIFF('2019-07-27', activity_date) >= 0
GROUP BY
    1
```
