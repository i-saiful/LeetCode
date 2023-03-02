# 21. Merge Two Sorted Lists

- Problem: [https://leetcode.com](https://leetcode.com/problems/merge-two-sorted-lists)

```kotlin
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1
        
        val nodes = ListNode(0)
        var node = nodes
        var firstNode = list1
        var secondNode = list2
        
        while (firstNode != null && secondNode != null) {
            if (firstNode.`val` <= secondNode.`val`) {
                node.next = firstNode
                firstNode = firstNode.next
            } else {
                node.next = secondNode
                secondNode = secondNode.next
            }
            node = node.next
        }
        
        if (firstNode != null) node.next = firstNode
        if (secondNode != null) node.next = secondNode
        
        return nodes.next
    }
}
```