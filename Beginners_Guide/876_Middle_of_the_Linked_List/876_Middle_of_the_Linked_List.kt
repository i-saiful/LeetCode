/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
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