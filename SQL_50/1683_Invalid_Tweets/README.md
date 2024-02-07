# 1683. Invalid Tweets

- Problem: [https://leetcode.com](https://leetcode.com/problems/invalid-tweets)

```sql
# Write your MySQL query statement below
SELECT
    tweet_id
FROM
    Tweets
WHERE
    LENGTH(content) > 15;
```