class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans=[]
        new=[]
        for i in nums:
            ans.append(i)

        for j in nums:
            new.append(j)   
        concat=ans+new
        return concat
        