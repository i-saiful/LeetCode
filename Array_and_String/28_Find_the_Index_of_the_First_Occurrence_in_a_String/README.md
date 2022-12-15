# 28. Find the Index of the First Occurrence in a String

- Problem: [https://leetcode.com](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string)

```kotlin
class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0
        return haystack.indexOf(needle)
    }
}
```