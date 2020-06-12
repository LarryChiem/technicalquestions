class Node: 
    def __init__(self, val=None):
        self.val = val
        self.next = None

class SLinkedList:
    def __init__(self):
        self.head = None
        
    def listprint(self):
        printval = self.head
        while printval is not None:
            print(printval.val)
            printval = printval.next
    
    def AtBeginning(self, newdata):
        NewNode = Node(newdata)
        NewNode.next = self.head
        self.head = NewNode

    def AtEnd(self, newdata):
        NewNode = Node(newdata)
        if self.head is None:
            self.head = NewNode
            return
        last = self.head
        while(last.next):
            last = last.next
        last.next = NewNode

    def RemoveNode(self, RemoveKey):

        HeadVal = self.head

        if (HeadVal == None):
            return

        # If RemoveKey is first
        if (HeadVal.val == RemoveKey):
            self.head = HeadVal.next
            HeadVal = None
            return
        while (HeadVal.val != RemoveKey):
            prev = HeadVal
            HeadVal = prev.next
        if (HeadVal.val == RemoveKey):
            prev.next = HeadVal.next
            HeadVal = None
            return

    def reverseUtil(self, curr, prev):

        # If last node mark it head
        if curr.next is None :
            self.head = curr

            # Update next to prev node
            curr.next = prev
            return

        # Save curr.next node for recursive call
        next = curr.next

        # And update next
        curr.next = prev

        self.reverseUtil(next, curr)


    # This function mainly calls reverseUtil()
    # with previous as None
    def reverse(self):
        if self.head is None:
            return
        self.reverseUtil(self.head, None)

list1 = SLinkedList()
list1.head = Node("Mon")
e2 = Node("Tue")
e3 = Node("Wed")
# Link first Node to second Node
list1.head.next = e2

e2.next = e3

list1.AtBeginning("Sun")
list1.AtEnd("Thu")

list1.RemoveNode("Thu")
list1.listprint()

list1.reverse()
list1.listprint()
