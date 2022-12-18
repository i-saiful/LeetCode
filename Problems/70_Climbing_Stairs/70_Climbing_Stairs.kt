class Solution {
    fun climbStairs(n: Int): Int {
        var curStep = 1
        var prevStep = 1
        for ( i in 2..n) {
            prevStep = curStep.also { curStep = curStep + prevStep }
        }
        return curStep
    }
}