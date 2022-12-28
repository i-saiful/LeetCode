class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var nodes = ListNode()
        nodes.next = head
        var fast = nodes
        var slow = nodes
        var index = 0
        while (index < n) {
            fast = fast?.next
            index++
        }
        
        while (fast?.next != null) {
            fast = fast?.next
            slow = slow?.next
        }
        
        slow?.next = slow?.next?.next
        return nodes.next
    }
}