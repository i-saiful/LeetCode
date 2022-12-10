class Solution {
    fun pivotIndex(nums: IntArray): Int {
        val sum = nums.sum()
        var leftSum = 0
        for(i in 0 until nums.size) {
            if(leftSum == sum - leftSum - nums[i]) {
                return i
            }
            leftSum += nums[i]
        }
        return -1
    }
}