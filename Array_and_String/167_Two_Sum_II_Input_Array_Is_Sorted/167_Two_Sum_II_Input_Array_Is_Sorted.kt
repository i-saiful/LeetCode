class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var firstIndex = 0
        var lastIndex = numbers.size - 1
        while (firstIndex < lastIndex) {
            val sum = numbers[firstIndex] + numbers[lastIndex]
            if (sum == target) {
                return intArrayOf(++firstIndex, ++lastIndex)
            } else if (sum < target) {
                firstIndex++
            } else {
                lastIndex--
            }
        }
        return intArrayOf()
    }
}