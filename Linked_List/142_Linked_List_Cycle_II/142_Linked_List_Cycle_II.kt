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