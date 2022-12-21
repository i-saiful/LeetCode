# 189. Rotate Array

- Problem: [https://leetcode.com](https://leetcode.com/problems/rotate-array)

```kotlin
class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val rotate = k % nums.size
        val copyNums = nums.copyOf()
    
        val n = nums.size
        for (i in 0 until n) {
            nums[(i + k) % n] = copyNums[i]
        }
    }
}
```