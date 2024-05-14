class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        stack = []
        res = []
        def bracktrack(openN, closedN):
            if openN == closedN == n:
                res.append("".join(stack))
                return
            if openN < n:
                stack.append("(")
                bracktrack(openN + 1, closedN)
                stack.pop()
            if closedN < openN:
                stack.append(")")
                bracktrack(openN, closedN + 1)
                stack.pop()
        bracktrack(0, 0)
        return res