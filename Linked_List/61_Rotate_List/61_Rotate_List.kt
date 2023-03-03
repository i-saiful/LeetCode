class Solution {
    fun rotateRight(head: ListNode?, k: Int): ListNode? {
        if (head == null || head.next == null || k == 0) return head
        
        var length = 0
        var nodes = head
        while (nodes != null) {
            length++
            nodes = nodes.next
        }
        
        val rotate = k % length
        if (rotate == 0) return head
        
        var fastNode = head
        var slowNode = head
        
        repeat(rotate) {
            fastNode = fastNode?.next
        }
        
        while (fastNode?.next != null) {
            slowNode = slowNode?.next
            fastNode = fastNode?.next
        }
        
        val newHead = slowNode?.next
        slowNode?.next = null
        fastNode?.next = head
        
        return newHead
    }
}