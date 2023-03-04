class Solution {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
        val nums2Set = nums2.toSet()
        val resultSheet = mutableSetOf<Int>()
        
        for (num in nums1) {
            if (num in nums2Set) {
                resultSheet.add(num)
            }
        }
        
        return resultSheet.toIntArray()
    }
}