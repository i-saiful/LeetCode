# 561. Array Partition

- Problem: [https://leetcode.com](https://leetcode.com/problems/array-partition)

```kotlin
class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        var sum = 0
        nums.sort()
        for (i in 0 until nums.size step 2) {
            sum += nums[i]
        }
        return sum
    }
}
```