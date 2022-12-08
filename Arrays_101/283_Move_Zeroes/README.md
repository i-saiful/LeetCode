# 283. Move Zeroes

- Problem: [https://leetcode.com](https://leetcode.com/problems/move-zeroes)

```kotlin
class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var lastNonZeroFoundAt = 0
        for(i in 0 until nums.size) {
            if(nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i]
                lastNonZeroFoundAt ++
            }
        }
        for(i in lastNonZeroFoundAt until nums.size) {
            nums[i] = 0
        }
    }
}
```