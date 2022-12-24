# 707. Design Linked List

- Problem: [https://leetcode.com](https://leetcode.com/problems/design-linked-list)

```kotlin
class MyLinkedList() {
    var nodes: Node? = null
    var nodesLength = 0
    
    fun get(index: Int): Int {
        if (nodesLength <= index) {
            return -1
        }
        var currentNode = nodes
        for (i in 0 until index) {
            currentNode = currentNode?.next
        }
        return currentNode?.value ?: -1
    }

    fun addAtHead(`val`: Int): MyLinkedList {
        var node = Node(`val`)
        node?.next = nodes
        nodes = node
        nodesLength++
        return this
    }

    fun addAtTail(`val`: Int): MyLinkedList  {
        if (nodes == null) {
            nodes = Node(`val`)
            nodesLength++
            return this
        }
        var currentNode = nodes
        while (currentNode?.next != null) {
            currentNode = currentNode?.next
        }
        currentNode?.next = Node(`val`)
        nodesLength++
        return this
    }

    fun addAtIndex(index: Int, `val`: Int): MyLinkedList {
        if (index == 0) {
            addAtHead(`val`)
            nodesLength++
            return this
        }
        var currentNode = nodes
        var idx = 1
        while (idx <= index - 1) {
            currentNode = currentNode?.next
            idx++
        }
        var node = Node(`val`)
        node?.next = currentNode?.next
        currentNode?.next = node
        nodesLength++
        return this
    }

    fun deleteAtIndex(index: Int): MyLinkedList {
        if (nodesLength <= index) {
            return this
        }
        var currentNode = nodes
        if (index == 0) {
            nodes = currentNode?.next
            nodesLength--
            return this
        }
        for (i in 0 until index - 1) {
            currentNode = currentNode?.next
        }
        currentNode?.next = currentNode?.next?.next
        nodesLength--
        return this
    }

}

data class Node(val value: Int, var next: Node? = null)

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(`val`)
 * obj.addAtTail(`val`)
 * obj.addAtIndex(index,`val`)
 * obj.deleteAtIndex(index)
 */
```