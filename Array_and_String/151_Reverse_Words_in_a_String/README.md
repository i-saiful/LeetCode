# 151. Reverse Words in a String

- Problem: [https://leetcode.com](https://leetcode.com/problems/reverse-words-in-a-string)

```kotlin
class Solution {
    fun reverseWords(s: String): String {
        return s.trim()
                .split(" ")
                .filter { it != ""}
                .reversed()
                .joinToString(" ")
    }
}
```