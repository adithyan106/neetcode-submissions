class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        arr = []

        current = head

        # Store the actual nodes
        while current:
            arr.append(current)
            current = current.next

        left = 0
        right = len(arr) - 1

        # Reorder nodes
        while left < right:
            arr[left].next = arr[right]
            left += 1

            arr[right].next = arr[left]
            right -= 1

        # End the list
        arr[left].next = None