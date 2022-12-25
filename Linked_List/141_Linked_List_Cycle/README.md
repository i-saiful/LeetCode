# 141. Linked List Cycle

- Problem: [https://leetcode.com](https://leetcode.com/problems/linked-list-cycle)

## Two Pointer

```kotlin
class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        var slowNode = head
        var fastNode = head?.next
        while (fastNode != null) {
            if (slowNode == fastNode) {
                return true
            }
            slowNode = slowNode?.next
            fastNode = fastNode?.next?.next           
        }
        return false
    }
}
```

## Hash Table

```kotlin
class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        val cache = HashSet<ListNode> ()
        var nodes = head
        while (nodes != null) {
            if (!cache.add(nodes)) {
                return true
            }
            nodes = nodes?.next
        }
        return false
    }
}
```