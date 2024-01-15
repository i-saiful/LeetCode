# 2667. Create Hello World Function

- Problem: [https://leetcode.com](https://leetcode.com/problems/create-hello-world-function/)

```javascript
/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World"
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */
```