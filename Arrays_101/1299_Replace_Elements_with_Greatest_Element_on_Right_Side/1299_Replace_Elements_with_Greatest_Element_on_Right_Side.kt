class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var max = -1
        for(i in arr.size - 1 downTo 0) {
            val temp = arr[i]
            arr[i] = max
            max = maxOf(temp, max)
        }
        return arr
    }
}