class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var index = 1
        for (i in 1 until nums.size) {
            if (nums[i - 1] != nums[i]) {
                nums[index] = nums[i]
                index++
            }
        }
        return index
    }
}