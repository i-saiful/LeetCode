# 876. Middle of the Linked List

- Problem: [https://leetcode.com](https://leetcode.com/problems/middle-of-the-linked-list/)

```kotlin
class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var middle = head
        var end = head
        while(end != null && end?.next != null) {
            middle = middle?.next
            end = end?.next?.next
        }
        return middle
    }
}
```