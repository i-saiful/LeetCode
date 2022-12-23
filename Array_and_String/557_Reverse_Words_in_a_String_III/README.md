# 557. Reverse Words in a String III

- Problem: [https://leetcode.com](https://leetcode.com/problems/reverse-words-in-a-string-iii)

```kotlin
class Solution {
    fun reverseWords(s: String): String {
        return s.split(" ")
                .map { it.reversed() }
                .joinToString(" ")
    }
}
```