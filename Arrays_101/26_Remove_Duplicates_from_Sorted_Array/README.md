# 26. Remove Duplicates from Sorted Array

- Problem: [https://leetcode.com](https://leetcode.com/problems/remove-duplicates-from-sorted-array)

```kotlin
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var insertIndex = 1
        for(i in 1..nums.size - 1) {
            if(nums[i - 1] != nums[i]) {
                nums[insertIndex] = nums[i]
                insertIndex ++
            }
        }
        return insertIndex
    }
}
```