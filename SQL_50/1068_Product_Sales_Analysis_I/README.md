# 1068. Product Sales Analysis I

- Problem: [https://leetcode.com](https://leetcode.com/problems/product-sales-analysis-i)

```sql
# Write your MySQL query statement below
SELECT
    product_name,
    year,
    price
FROM
    Sales
JOIN
    Product ON
    Sales.product_id  = Product.product_id
```