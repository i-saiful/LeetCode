# 2703. Return Length of Arguments Passed

- Problem: [https://leetcode.com](https://leetcode.com/problems/return-length-of-arguments-passed)

```javascript
/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    return args.length
};

/**
 * argumentsLength(1, 2, 3); // 3
 */
```