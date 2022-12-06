class Solution {
    fun checkIfExist(arr: IntArray): Boolean {
        val table = mutableListOf<Int>()
        for(i in arr) {
            if(table.contains(i * 2) || table.contains(i / 2) && i%2 == 0)
                return true
            table.add(i)
        }
        return false
    }
}