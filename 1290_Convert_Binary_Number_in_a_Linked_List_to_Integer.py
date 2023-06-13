# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        binary=[]
        while head!=None:
            binary.append(head.val)
            head=head.next
        return int("".join(str(i)for i in binary),2)