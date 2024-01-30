# 2631. Group By

- Problem: [https://leetcode.com](https://leetcode.com/problems/group-by)

```javascript
/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function(fn) {
    let result = {}
    this.forEach(x => {
        if(result[fn(x)]) result[fn(x)].push(x)
        else result[fn(x)] = [x]
    })
    return result
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */
```