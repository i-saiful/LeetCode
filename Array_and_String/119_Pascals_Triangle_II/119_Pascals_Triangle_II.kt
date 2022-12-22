class Solution {
    fun getRow(rowIndex: Int): List<Int> {
        val pascel = mutableListOf<List<Int>> ()
        pascel.add(listOf(1))
        for (i in 0 until rowIndex) {
            val row = mutableListOf<Int> ()
            row.add(1)
            if( i != 0) {
                val prevRow = pascel[i]
                for (j in 0 until prevRow.size - 1) {
                    row.add(prevRow[j] + prevRow[j + 1])
                }
            }
            row.add(1)
            pascel.add(row)
        }
        return pascel.last()
    }
}