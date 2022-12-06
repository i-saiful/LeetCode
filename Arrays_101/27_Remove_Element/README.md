# 27. Remove Element

- Problem: [https://leetcode.com](https://leetcode.com/problems/remove-element)

```kotlin
class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var lastIndex = 0
        for(index in 0..nums.size - 1) {
            if(nums[index] != `val`) {
                nums[lastIndex] = nums[index]
                lastIndex ++
            }
        }
        return lastIndex
    }
}
```