# 599. Minimum Index Sum of Two Lists

- Problem: [https://leetcode.com](https://leetcode.com/problems/minimum-index-sum-of-two-lists)

```kotlin
class Solution {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        val indexMap = HashMap<String, Int>()
        var minSum = Int.MAX_VALUE
        val common = mutableListOf<String>()
        
        list1.forEachIndexed { index, s ->
            indexMap[s] = index
        }
        
        list2.forEachIndexed { index, s ->
            if (indexMap.contains(s)) {
                val sum = index + indexMap[s]!!
                if (sum < minSum) {
                    minSum = sum
                    common.clear()
                    common.add(s)
                } else if (sum == minSum) {
                    common.add(s)
                }
            }
        }
        
        return common.toTypedArray()
    }
}
```

```kotlin
class Solution {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        val indexMap = list1.mapIndexed {index, str -> str to index}.toMap()
        var minSum = Int.MAX_VALUE
        val common = mutableListOf<String>()
        
        for ((index, str) in list2.withIndex()) {
            if (str in indexMap) {
                val sum = index + indexMap[str]!!
                if (sum < minSum) {
                    minSum = sum
                    common.clear()
                    common.add(str)
                } else if (sum == minSum) {
                    common.add(str)
                }
            }
        }
        
        return common.toTypedArray()
    }
}
```