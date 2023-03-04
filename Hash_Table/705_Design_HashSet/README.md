# 705. Design HashSet

- Problem: [https://leetcode.com](https://leetcode.com/problems/design-hashset)

```kotlin
class MyHashSet() {
    private val buckets = BooleanArray(10000001)

    fun add(key: Int) {
        buckets[key] = true
    }

    fun remove(key: Int) {
        buckets[key] = false
    }

    fun contains(key: Int): Boolean {
        return buckets[key] == true
    }

}
```