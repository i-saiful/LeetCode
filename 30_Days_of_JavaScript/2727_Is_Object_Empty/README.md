# 2727. Is Object Empty

- Problem: [https://leetcode.com](https://leetcode.com/problems/is-object-empty)

```javascript
/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
    return Object.keys(obj).length === 0
};
```