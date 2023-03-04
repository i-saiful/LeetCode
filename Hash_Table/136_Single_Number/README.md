# 136. Single Number

- Problem: [https://leetcode.com](https://leetcode.com/problems/single-number)

```kotlin
class Solution {
    fun singleNumber(nums: IntArray): Int {
        return nums.reduce {prev, curr -> prev xor curr}
    }
}
```