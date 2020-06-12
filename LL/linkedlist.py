class Node: 
    def __init__(self, val=None):
        self.val = val
        self.next = None

class SLinkedList:
    def __init__(self):
        self.headval = None
        
    def listprint(self):
        printval = self.headval
        while printval is not None:
            print(printval.val)
            printval = printval.next
    
    def AtBeginning(self, newdata):
        NewNode = Node(newdata)
        NewNode.next = self.headval
        self.headval = NewNode

    def AtEnd(self, newdata):
        NewNode = Node(newdata)
        if self.headval is None:
            self.headval = NewNode
            return
        last = self.headval
        while(last.next):
            last = last.next
        last.next = NewNode

    def RemoveNode(self, RemoveKey):

        HeadVal = self.headval

        if (HeadVal == None):
            return

        # If RemoveKey is first
        if (HeadVal.val == RemoveKey):
            self.headval = HeadVal.next
            HeadVal = None
            return
        while (HeadVal.val != RemoveKey):
            prev = HeadVal
            HeadVal = prev.next
        if (HeadVal.val == RemoveKey):
            prev.next = HeadVal.next
            HeadVal = None
            return

    def _ReverseList(self, head):
        if head is None or head.next is None:
            return head
        p = self.ReverseList(head.next)
        head.next.next = head
        head.next = None
        print(p.headval)
        return p

list1 = SLinkedList()
list1.headval = Node("Mon")
e2 = Node("Tue")
e3 = Node("Wed")
# Link first Node to second Node
list1.headval.next = e2

e2.next = e3

list1.AtBeginning("Sun")
list1.AtEnd("Thu")

list1.RemoveNode("Thu")
list1.listprint()
