# 941. Valid Mountain Array

- Problem: [https://leetcode.com](https://leetcode.com/problems/valid-mountain-array)

```kotlin
class Solution {
    fun validMountainArray(arr: IntArray): Boolean {
        var i = 0
        val arrLength = arr.size
        
        while(i+1 < arrLength && arr[i] < arr[i + 1])
            i++
        
        if(i == 0 || i == arrLength - 1)
            return false
        
        while(i+1 < arrLength && arr[i] > arr[i+1])
            i++
        
        return i == arrLength - 1
    }
}
```