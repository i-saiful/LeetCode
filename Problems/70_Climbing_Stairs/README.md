# 70. Climbing Stairs

- Problem: [https://leetcode.com](https://leetcode.com/problems/climbing-stairs)

```kotlin
class Solution {
    fun climbStairs(n: Int): Int {
        var curStep = 1
        var prevStep = 1
        for ( i in 2..n) {
            prevStep = curStep.also { curStep = curStep + prevStep }
        }
        return curStep
    }
}
```