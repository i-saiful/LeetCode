class Solution {
    fun findRestaurant(list1: Array<String>, list2: Array<String>): Array<String> {
        val indexMap = HashMap<String, Int>()
        var minSum = Int.MAX_VALUE
        val common = mutableListOf<String>()
        
        list1.forEachIndexed { index, s ->
            indexMap[s] = index
        }
        
        list2.forEachIndexed { index, s ->
            if (indexMap.contains(s)) {
                val sum = index + indexMap[s]!!
                if (sum < minSum) {
                    minSum = sum
                    common.clear()
                    common.add(s)
                } else if (sum == minSum) {
                    common.add(s)
                }
            }
        }
        
        return common.toTypedArray()
    }
}