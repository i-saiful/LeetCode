# 1346. Check If N and Its Double Exist

- Problem: [https://leetcode.com](https://leetcode.com/problems/check-if-n-and-its-double-exist)

```kotlin
class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        val table = mutableListOf<Int>()
        for(i in arr) {
            if(table.contains(i * 2) || table.contains(i / 2) && i%2 == 0)
                return true
            table.add(i)
        }
        return false
    }
}
```