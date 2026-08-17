# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        pos=head
        
        length=0
        while head:
            length +=1
            head=head.next
        target=length-n
        head=pos
        prev=None
        if target == 0:
            return head.next
        while head:
            prev=head
            head=head.next
            target-=1
            if target==0:
                prev.next=head.next
        return pos
                

        