# 2677. Chunk Array

- Problem: [https://leetcode.com](https://leetcode.com/problems/chunk-array)

```javascript
/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    const chunkArr = []
    for(let i = 0; i < arr.length; i += size) {
        chunkArr.push(arr.slice(i, i + size))
    }
    return chunkArr
};

```