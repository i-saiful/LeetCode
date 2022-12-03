# 977. Squares of a Sorted Array

- Problem: [https://leetcode.com](https://leetcode.com/problems/squares-of-a-sorted-array)

```kotlin
class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        return nums.map{it*it}.sorted().toIntArray()
    }
}
```