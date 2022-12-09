# 414. Third Maximum Number

- Problem: [https://leetcode.com](https://leetcode.com/problems/third-maximum-number)

```kotlin
class Solution {
    fun thirdMax(nums: IntArray): Int {
        val ans = nums.toSet().sortedDescending()
        if(ans.size < 3) {
            return ans[0]
        } else {
            return ans[2]
        }       
    }
}
```