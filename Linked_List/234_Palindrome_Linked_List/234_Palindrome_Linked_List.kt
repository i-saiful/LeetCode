class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        var nodes = head
        var palindromeString = StringBuilder()
        while (nodes != null) {
            palindromeString.append(nodes.`val`)
            nodes = nodes?.next
        }
        return palindromeString.toString() == palindromeString.reverse().toString()
    }
}