class Solution {
    fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
        val m = mat.size 
        val n = mat.first().size
        
        val result = mutableMapOf<Int, MutableList<Int>>()
        
        for (i in 0..(m + n - 2)) {
            result[i] = mutableListOf()
        }
        
        
        mat.indices.forEach { i ->
            mat[i].forEachIndexed {
                j, value -> result[i + j]?.add(value)
            }
        }
        
        result.mapValues {
            (key, value) -> 
                if(key and 1 == 0) {
                    value.reverse()
                }
        }
        
        return result.flatMap { it.value }.toIntArray()
    }
}