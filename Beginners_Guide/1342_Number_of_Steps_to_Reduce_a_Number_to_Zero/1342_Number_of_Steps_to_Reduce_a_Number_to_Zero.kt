class Solution {
    fun numberOfSteps(num: Int): Int {
        var steps = 0
        var copyNum = num
        while(copyNum > 0) {
            if(copyNum % 2 == 0) {
                copyNum /= 2
            } else {
                copyNum--
            }
            steps++
        }
        return steps
    }
}