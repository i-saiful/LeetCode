# 1480. Running Sum of 1d Array

- Problem: [https://leetcode.com](https://leetcode.com/problems/running-sum-of-1d-array)

```kotlin
class Solution {
    fun runningSum(nums: IntArray): IntArray {
        for(i in 1..nums.size - 1) 
            nums[i] += nums[i - 1]
        return nums
    }
}
```