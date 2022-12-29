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