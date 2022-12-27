class Solution {
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        val nodes = HashSet<ListNode?> ()
        var nodesA = headA
        var nodesB = headB
        while (nodesA != null || nodesB != null) {
            if (!nodes.add(nodesA) && nodesA != null) return nodesA
            if (!nodes.add(nodesB) && nodesB != null) return nodesB
            nodesA = nodesA?.next
            nodesB = nodesB?.next
        }
        return null
    }
}