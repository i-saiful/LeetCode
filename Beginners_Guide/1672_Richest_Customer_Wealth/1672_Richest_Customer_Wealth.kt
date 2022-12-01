class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var maxWealthSoFar = 0
        for(customer in accounts) {
            var currentCustomerWealth = 0
            for(bank in customer) 
                currentCustomerWealth += bank
            maxWealthSoFar = maxOf(maxWealthSoFar, currentCustomerWealth)
        }
        return maxWealthSoFar
    }
}