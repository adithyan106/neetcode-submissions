# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        set1=set()
        curr=head
        while(curr!=None):
            curr=curr.next
            if curr in set1:
                return True
            else:
                set1.add(curr)
        return False
            