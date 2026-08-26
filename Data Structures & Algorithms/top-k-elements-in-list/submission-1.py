class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:

        h1 = {}

        for i in nums:
            h1[i] = h1.get(i, 0) + 1

        arr = sorted(h1, key=h1.get, reverse=True)

        return arr[:k]