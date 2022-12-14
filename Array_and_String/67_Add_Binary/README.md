# 67. Add Binary

- Problem: [https://leetcode.com](https://leetcode.com/problems/add-binary)

```kotlin
class Solution {
    fun addBinary(a: String, b: String): String {
     return (a.toBigInteger(2) + b.toBigInteger(2)).toString(2)   
    }
}
```