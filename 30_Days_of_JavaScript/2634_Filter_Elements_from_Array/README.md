# 2634. Filter Elements from Array

- Problem: [https://leetcode.com](https://leetcode.com/problems/filter-elements-from-array)

```javascript
/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    return arr.filter((value, i) => fn(value,i))
};
```