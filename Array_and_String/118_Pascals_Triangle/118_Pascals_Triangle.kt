class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val numsList = mutableListOf<List<Int>> ()
        
        for (i in 0 until numRows) {
            val numList = mutableListOf<Int> ()
            numList.add(1)
            
            if (i != 0) {
                val prevList = numsList[i - 1]
                for(j in 0 until prevList.size - 1) {
                    numList.add(prevList[j] + prevList[j + 1])
                }
                numList.add(1)
            }
            
            numsList.add(numList)
        }
        
        return numsList
    }
}