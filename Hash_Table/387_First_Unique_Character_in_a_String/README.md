# 387. First Unique Character in a String

- Problem: [https://leetcode.com](https://leetcode.com/problems/first-unique-character-in-a-string)

```kotlin
class Solution {
    fun firstUniqChar(s: String): Int {
        val charCount = HashMap<Char, Int>()
        
        for (c in s) {
            charCount[c] = charCount.getOrDefault(c, 0) + 1
        }
        
        for ((i, c) in s.withIndex()) {
            if (charCount[c] == 1) {
                return i
            }
        }
        
        return -1
    }
}
```