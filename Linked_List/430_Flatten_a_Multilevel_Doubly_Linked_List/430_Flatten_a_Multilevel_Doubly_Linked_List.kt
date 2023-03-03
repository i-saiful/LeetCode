class Solution {
    fun flatten(root: Node?): Node? {
        var nodes = root
        
        // Traverse root
        while (nodes != null) {
            // Check for child node
            if (nodes.child != null) {
                val nextNode = nodes.next
                
                nodes.next = nodes.child
                nodes.child?.prev = nodes
                nodes.child = null
                
                var nodeOfChild = nodes.next
                while (nodeOfChild?.next != null) {
                    nodeOfChild = nodeOfChild.next
                }
                
                nodeOfChild?.next = nextNode
                if (nextNode != null) nextNode.prev = nodeOfChild
            }
            nodes = nodes?.next
        }
        return root
    }
}