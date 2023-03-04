# 217. Contains Duplicate

- Problem: [https://leetcode.com](https://leetcode.com/problems/contains-duplicate)

```kotlin
class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val hashSet = HashSet<Int>()
        for (num in nums) if (!hashSet.add(num)) return true
        return false
    }
}
```