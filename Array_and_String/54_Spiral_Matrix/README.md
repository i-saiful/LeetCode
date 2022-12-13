# 54. Spiral Matrix

- Problem: [https://leetcode.com](https://leetcode.com/problems/spiral-matrix)

```kotlin
class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val itemList = mutableListOf<Int> ()
        var top = 0
        var left = 0
        var bottom = matrix.size - 1
        var right = matrix[0].size - 1
        var direction = 0
        
        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for (i in left..right) {
                    itemList.add(matrix[left][i])
                }
                top++
            } else if (direction == 1) {
                for (i in top..bottom) {
                    itemList.add(matrix[i][right])
                }
                right--
            } else if (direction == 2) {
                for (i in right downTo left) {
                    itemList.add(matrix[bottom][i])
                }
                bottom--
            } else if (direction == 3) {
                for (i in bottom downTo top) {
                    itemList.add(matrix[i][left])
                }
                left++
            }
            direction = (direction + 1) % 4
        }
        return itemList
    }
}
```