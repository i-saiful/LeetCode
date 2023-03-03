class Solution {
    fun copyRandomList(node: Node?): Node? {
        if (node == null) return null
        
        val root = mutableMapOf<Node, Node>()
        
        var nodes = node
        while (nodes != null) {
            val temp = Node(nodes.`val`)
            root[nodes] = temp
            nodes = nodes.next
        }
        
        nodes = node
        while (nodes != null) {
            root[nodes]?.random = root[nodes?.random]
            root[nodes]?.next = root[nodes?.next]
            nodes = nodes.next
        }
        
        return root[node]
    }
}