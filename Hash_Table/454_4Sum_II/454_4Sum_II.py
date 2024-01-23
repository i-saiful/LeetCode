class Solution:
    def fourSumCount(self, nums1: List[int], nums2: List[int], nums3: List[int], nums4: List[int]) -> int:
        table = defaultdict(int)
        numLen = len(nums1)
        res = 0
        
        for i in range(numLen):
            for j in range(numLen):
                table[nums1[i] + nums2[j]] += 1
                
        for i in range(numLen):
            for j in range(numLen):
                res += table[0 - (nums3[i] + nums4[j])]
                
        return res