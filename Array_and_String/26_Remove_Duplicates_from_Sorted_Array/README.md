# 26. Remove Duplicates from Sorted Array

- Problem: [https://leetcode.com](https://leetcode.com/problems/remove-duplicates-from-sorted-array)

```kotlin
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var index = 1
        for (i in 1 until nums.size) {
            if (nums[i - 1] != nums[i]) {
                nums[index] = nums[i]
                index++
            }
        }
        return index
    }
}
```