# 747. Largest Number At Least Twice of Others

- Problem: [https://leetcode.com](https://leetcode.com/problems/largest-number-at-least-twice-of-others)

```kotlin
class Solution {
    fun dominantIndex(nums: IntArray): Int {
        val maxIndex = nums.indexOf(nums.max()!!)
        for(i in 0 until nums.size) {
            if(nums[maxIndex] != nums[i] && nums[maxIndex] < 2 * nums[i]) {
                return -1
            }
        }
        return maxIndex
    }
}
```