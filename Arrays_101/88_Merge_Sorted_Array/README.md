# 88. Merge Sorted Array

- Problem: [https://leetcode.com](https://leetcode.com/problems/merge-sorted-array)

```kotlin
class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
       for(i in 0 until n) {
           nums1[m + i] = nums2[i]
       }
       nums1.sort()
    }
}
```