# 1051. Height Checker

- Problem: [https://leetcode.com](https://leetcode.com/problems/height-checker)

```kotlin
class Solution {
    fun heightChecker(heights: IntArray): Int {
        val expected = heights.sorted()
        var notMatch = 0
        for (i in 0 until heights.size) {
            if(heights[i] != expected[i]) {
                notMatch ++
            }
        }
        return notMatch
    }
}
```