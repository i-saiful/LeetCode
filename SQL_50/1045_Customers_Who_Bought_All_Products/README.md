# 1045. Customers Who Bought All Products

- Problem: [https://leetcode.com](https://leetcode.com/problems/customers-who-bought-all-products)

```sql
# Write your MySQL query statement below
SELECT
    customer_id 
FROM
    Customer
GROUP BY
    customer_id
HAVING
    COUNT(DISTINCT product_key) = (SELECT COUNT(*) FROM Product)
```