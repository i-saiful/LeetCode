class Solution {
    fun runningSum(nums: IntArray): IntArray {
        for(i in 1..nums.size - 1) 
            nums[i] += nums[i - 1]
        return nums
    }
}