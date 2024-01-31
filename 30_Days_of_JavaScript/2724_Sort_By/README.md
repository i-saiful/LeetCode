# 2724. Sort By

- Problem: [https://leetcode.com](https://leetcode.com/problems/sort-by)

```javascript
/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
var sortBy = function(arr, fn) {
    return arr.sort((a, b) => fn(a) - fn(b))
};
```