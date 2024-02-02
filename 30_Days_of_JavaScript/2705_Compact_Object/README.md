# 2705. Compact Object

- Problem: [https://leetcode.com](https://leetcode.com/problems/compact-object)

```javascript
/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function(obj) {
   if(obj === null) return null
   if(Array.isArray(obj)) return obj.filter(Boolean).map(compactObject)
   if(typeof obj !== "object") return obj

   const compacted = {}
   for(const key in obj){
       let value = compactObject(obj[key])
       if(Boolean(value)) compacted[key] = value
   }
   return compacted
};
```