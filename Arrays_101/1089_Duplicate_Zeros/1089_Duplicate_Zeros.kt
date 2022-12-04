class Solution {
    fun duplicateZeros(arr: IntArray): Unit {
        var index = 0
        while(index < arr.size) {
            if(arr[index] == 0) {
                for(j in arr.size-1 downTo index + 1)
                    arr[j] = arr[j - 1]
                index ++
            }
            index ++
        }
    }
}