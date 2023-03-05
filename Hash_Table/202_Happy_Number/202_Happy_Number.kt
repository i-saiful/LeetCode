class Solution {
    fun isHappy(n: Int): Boolean {
        // Initialize value
        var num = n
        val seen = mutableSetOf<Int>()
        
        // Tranverse num until not found happy number 1
        while (num != 1) {
            var sum = 0
            
            // calculate next digit
            while (num > 0) {
                val digit = num % 10
                sum += digit * digit
                num /= 10
            }
            
            // check for cycle
            if (sum in seen) return false
            
            // store new number
            seen.add(sum)
            num = sum
        }
        
        return true
    }
}