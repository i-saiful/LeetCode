# 14. Longest Common Prefix

- Problme: [https://leetcode.com](https://leetcode.com/problems/longest-common-prefix)

```kotlin
class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var prefix = strs[0]
        for (str in strs) {
            prefix = prefix.commonPrefixWith(str, true)
        }
        return prefix
    }
}
```