class Solution {
    fun plusOne(digits: IntArray): IntArray {
        for(i in (0..digits.size - 1).reversed()) {
            if(digits[i] < 9) {
                digits[i] += 1
                return digits
            } else {
                digits[i] = 0
            }
        }
        val digit = IntArray(digits.size + 1)
        digit[0] = 1
        return digit
    }
}