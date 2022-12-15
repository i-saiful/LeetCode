class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var prefix = strs[0]
        for (str in strs) {
            prefix = prefix.commonPrefixWith(str, true)
        }
        return prefix
    }
}