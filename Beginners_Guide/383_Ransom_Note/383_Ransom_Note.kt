class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val magazineLetters = mutableMapOf<Char, Int>()
        for(letter in magazine) {
            magazineLetters[letter] = magazineLetters[letter] ?: 0
            magazineLetters[letter] = magazineLetters[letter]!! + 1
        }

        for(letter in ransomNote) {
            val currentCount = magazineLetters[letter]
            if(currentCount == null || currentCount == 0)
                return false
            magazineLetters[letter] = magazineLetters[letter]!! - 1
        }

        return true
    }
}