# 2666. Allow One Function Call

- Problem: [https://leetcode.com](https://leetcode.com/problems/allow-one-function-call)

```javascript
/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function (fn) {
    let called = false

    return function (...args) {
        if (!called) {
            called = true
            return fn(...args)
        }
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */

```