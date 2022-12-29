# 206. Reverse Linked List

- Problem: [https://leetcode.com](https://leetcode.com/problems/reverse-linked-list)

```kotlin
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var nodes: ListNode? = null
        var node = head
        while (node != null) {
            val nextNode = node?.next
            node?.next = nodes
            nodes = node
            node = nextNode
        }
        return nodes
    }
}
```