class Solution {
    fun fizzBuzz(n: Int): List<String> {
        val answer = mutableListOf<String>()
        for(i in 1..n) {
            val divisibleBy3: Boolean = i % 3 == 0
            val divisibleBy5: Boolean = i % 5 == 0

            var currentResult = ""

            if(divisibleBy3) currentResult += "Fizz"
            if(divisibleBy5) currentResult += "Buzz"
            if(currentResult.isEmpty()) currentResult += i

            answer.add(currentResult)
        }
        return answer
    }
}