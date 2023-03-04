class Solution {
    fun singleNumber(nums: IntArray): Int {
        return nums.reduce {prev, curr -> prev xor curr}
    }
}