# 1207. Unique Number of Occurrences

- ```Problem```: [https://LeetCode.com](https://leetcode.com/problems/unique-number-of-occurrences/description/)

```kotlin
class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val hashTable = mutableMapOf<Int, Int>()
        for(element in arr) {
            hashTable[element] = hashTable[element] ?: 0
            hashTable[element] = hashTable[element]!! + 1
        }
        val hashSet = hashTable.values.toSet()
        return hashSet.size == hashTable.size
    }
}
```