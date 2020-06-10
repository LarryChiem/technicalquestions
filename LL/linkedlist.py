class Node: 
    def __init__(self, dataval=None):
        self.dataval = dataval
        self.nextval = None

class SLinkedList:
    def __init__(self):
        self.headval = None
        
    def listprint(self):
        printval = self.headval
        while printval is not None:
            print(printval.dataval)
            printval = printval.nextval
    
    def AtBeginning(self, newdata):
        NewNode = Node(newdata)
        NewNode.nextval = self.headval
        self.headval = NewNode

    def AtEnd(self, newdata):
        NewNode = Node(newdata)
        if self.headval is None:
            self.headval = NewNode
            return
        last = self.headval
        while(last.nextval):
            last = last.nextval
        last.nextval = NewNode

    def RemoveNode(self, RemoveKey):

        HeadVal = self.headval

        if (HeadVal == None):
            return

        # If RemoveKey is first
        if (HeadVal.dataval == RemoveKey):
            self.headval = HeadVal.nextval
            HeadVal = None
            return
        while (HeadVal.dataval != RemoveKey):
            prev = HeadVal
            HeadVal = prev.nextval
        if (HeadVal.dataval == RemoveKey):
            prev.nextval = HeadVal.nextval
            HeadVal = None
            return

        
list1 = SLinkedList()
list1.headval = Node("Mon")
e2 = Node("Tue")
e3 = Node("Wed")
# Link first Node to second Node
list1.headval.nextval = e2

e2.nextval = e3

list1.AtBeginning("Sun")
list1.AtEnd("Thu")

list1.RemoveNode("Thu")
list1.listprint()


