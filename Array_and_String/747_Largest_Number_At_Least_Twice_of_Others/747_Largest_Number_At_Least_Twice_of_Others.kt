class Solution {
    fun dominantIndex(nums: IntArray): Int {
        val maxIndex = nums.indexOf(nums.max()!!)
        for(i in 0 until nums.size) {
            if(nums[maxIndex] != nums[i] && nums[maxIndex] < 2 * nums[i]) {
                return -1
            }
        }
        return maxIndex
    }
}