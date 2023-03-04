# 706. Design HashMap

- Problem: [https://leetcode.com](https://leetcode.com/problems/design-hashmap)

```kotlin
class MyHashMap() {
    private val map = arrayOfNulls<Int>(10000001)

    fun put(key: Int, value: Int) {
        map[key] = value
    }

    fun get(key: Int): Int {
        return map[key] ?: -1
    }

    fun remove(key: Int) {
        map[key] = null
    }

}
```