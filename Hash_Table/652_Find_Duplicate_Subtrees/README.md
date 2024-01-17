# 652. Find Duplicate Subtrees

- Problem: [https://leetcode.com](https://leetcode.com/problems/find-duplicate-subtrees)

```python
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findDuplicateSubtrees(self, root: Optional[TreeNode]) -> List[Optional[TreeNode]]:
        subtrees = defaultdict(list)
        
        def dfs(node):
            if not node:
                return "null"
            s = ",".join([str(node.val), dfs(node.left), dfs(node.right)])
            if len(subtrees[s]) == 1:
                res.append(node)
            subtrees[s].append(s)
            return s
        
        res = []
        dfs(root)
        return res
```