class Solution {
    fun oddEvenList(head: ListNode?): ListNode? {
        var odd = head
        var evenHead = odd?.next
        var even = evenHead
        while (even != null && even?.next != null) {
            odd?.next = even?.next
            odd = odd?.next
            even?.next = odd?.next
            even = even?.next
            
        }
        odd?.next = evenHead
        return head
    }
}