class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val notAppear = mutableListOf<Int>()
        for (i in 1..nums.size) {
            if (i !in nums) {
                notAppear.add(i)
            }
        }
        return notAppear
    }
}