# 142. Linked List Cycle II

- Problem: [https://leetcode.com](https://leetcode.com/problems/linked-list-cycle-ii)

```kotlin
class Solution {
    fun detectCycle(head: ListNode?): ListNode? {
        val cache = HashSet<ListNode> ()
        var nodes = head
        while (nodes != null && cache.add(nodes)) {
            nodes = nodes?.next
        }
        return nodes
    }
}
```