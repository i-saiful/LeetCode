# 448. Find All Numbers Disappeared in an Array

- Problem: [https://leetcode.com](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array)

```kotlin
class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val notAppear = mutableListOf<Int>()
        for (i in 1..nums.size) {
            if (i !in nums) {
                notAppear.add(i)
            }
        }
        return notAppear
    }
}
```