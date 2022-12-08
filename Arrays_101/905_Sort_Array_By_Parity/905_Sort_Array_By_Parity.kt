class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        val ans = IntArray(nums.size) 
        var index = 0
        for(i in nums) {
            if(i % 2 == 0) {
                ans[index++] = i
            }
        }
        
        for(i in nums) {
            if(i % 2 == 1) {
                ans[index++] = i
            }
        }
        return ans
    }
}