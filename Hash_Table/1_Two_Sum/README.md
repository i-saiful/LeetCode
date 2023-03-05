# 1. Two Sum

- Problem: [https://leetcode.com](https://leetcode.com/problems/two-sum)

```kotlin
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = mutableMapOf<Int, Int>()
        
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (hashMap.containsKey(complement)) {
                return intArrayOf(hashMap[complement]!!, i)
            }
            
            hashMap[nums[i]] = i
        }
        
        throw IllegalArgumentException("No two sum solution")
    }
}
```