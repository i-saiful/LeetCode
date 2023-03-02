class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        // Initialize pointers
        val nodes = ListNode(0)
        var node = nodes
        var firstNode = l1
        var secondNode = l2
        var carry = 0
        
        // Travaers both list
        while (firstNode != null || secondNode != null || carry != 0) {
            val a = firstNode?.`val` ?: 0
            val b = secondNode?.`val` ?: 0
            val sum = carry + a + b
            carry = sum / 10
            node.next = ListNode(sum % 10)
            node = node.next
            firstNode = firstNode?.next
            secondNode = secondNode?.next
        }
        
        return nodes.next
    }
}