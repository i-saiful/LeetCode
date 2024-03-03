# 596. Classes More Than 5 Students

- Problem: [https://leetcode.com](https://leetcode.com/problems/classes-more-than-5-students)

```sql
# Write your MySQL query statement below
SELECT
    class
FROM
    Courses
GROUP BY
    class
HAVING
    COUNT(class) >= 5
```