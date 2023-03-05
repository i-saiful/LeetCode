# 205. Isomorphic Strings

- Problem: [https://leetcode.com](https://leetcode.com/problems/isomorphic-strings)

```kotlin
class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        // Initialize Hash map.
        val hashMap = HashMap<Char, Char>()
        
        // Travel both string
        for (i in s.indices) {
            val a = s[i]
            val b = t[i]
            
            // check for key value
            if (a !in hashMap && b in hashMap.values) {
                return false
            } else if (a in hashMap && hashMap[a] != b) {
                return false
            } else {
                hashMap[a] = b
            }
        }
        return true
    }
}
```