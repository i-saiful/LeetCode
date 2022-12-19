# 209. Minimum Size Subarray Sum

- Problem: [https://leetcode.com](https://leetcode.com/problems/minimum-size-subarray-sum)

```kotlin
class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        val n = nums.size
        var min = Int.MAX_VALUE
        var sum = 0
        var left = 0
        for (i in 0..n-1) {
            sum += nums[i]
            
            while (sum >= target) {
                min = minOf(min, i + 1 - left)
                sum -= nums[left]
                left++
            }
        }
        return if (min == Int.MAX_VALUE) 0 else min
    }
}
```