# 203. Remove Linked List Elements

- Problem: [https://leetcode.com](https://leetcode.com/problems/remove-linked-list-elements)

```kotlin
class Solution {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var nodes = ListNode()
        nodes?.next = head
        var node = nodes
        while (node?.next != null) {
            if (node?.next.`val` == `val`) {
                node?.next = node?.next?.next
            } else {
                node = node?.next
            }
        }
        return nodes?.next
    }
}
```