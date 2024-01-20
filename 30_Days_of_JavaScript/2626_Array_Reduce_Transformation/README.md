# 2626. Array Reduce Transformation

- Problem: [https://leetcode.com](https://leetcode.com/problems/array-reduce-transformation)

```javascript
/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    return nums.reduce((preValue, currentValue) => fn(preValue, currentValue), init)
};
```