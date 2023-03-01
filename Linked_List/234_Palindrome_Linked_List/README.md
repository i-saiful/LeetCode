# 234. Palindrome Linked List

- Problem: [https://leetcode.com](https://leetcode.com/problems/palindrome-linked-list)

```kotlin
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
```