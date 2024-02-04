# 1757. Recyclable and Low Fat Products

- Problem: [https://leetcode.com](https://leetcode.com/problems/recyclable-and-low-fat-products)

```sql
# Write your MySQL query statement below
SELECT 
    product_id
FROM 
    Products
WHERE 
    low_fats = 'Y' 
    AND recyclable = 'Y';
```