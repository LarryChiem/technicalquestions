import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;

//9.8 IMPLEMENT A CIRCULAR QUEUE
//        A queue can be implemented using an array and two additional fields, the beginning
//        and the end indices. This structure is sometimes referred to as a circular queue. Both
//        enqueue and dequeue have 0(1) time complexity. If the array is fixed, there is a
//        maximum number of entries that can be stored. If the array is dynamically resized,
//        the total time for m combined enqueue and dequeue operations is0(m).
//        Implement a queue API using an array for storing elements. Your API should include
//        a constructor function, which takes as argument the initial capacity of the queue,
//        enqueue and dequeuefunctions,and a function which returns the numberof elements
//        stored. Implement dynamic resizing to support storing an arbitrarily large number
//        of elements.
//        Hint: Track the head and tail. How can you differentiate a full queue from an empty one?
public class Queue {
    int head, tail = -1, numQueueElements = 0;
    final int[] entries;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        entries = new int[k];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(!isFull()) {
            tail = (tail + 1) % entries.length;
            entries[tail] = value;
            numQueueElements++;
            return true;
        } else return false;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (!isEmpty()) {
            head = (head + 1) % entries.length;
            --numQueueElements;
            return true;
        }
        return false;
    }

    /** Get the front item from the queue. */
    public int Front() {
        return isEmpty() ? -1 : entries[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        return isEmpty() ? -1 : entries[tail];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return numQueueElements == 0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return numQueueElements == entries.length;
    }
}
//Solution: A brute-force approach is to use an array, with the head always at index
//        0. An additional variable tracks the index of the tail element. Enqueue has0(1) time
//        complexity. However dequeue's time complexity is 0(n), where n is the number of
//        elements in the queue, since every element has to be left-shifted to fill up the space
//        created at index 0.
//        A better approach is to keep one more variable to track the head. This way,
//        dequeue can also be performed in <9(1) time. When performing an enqueue into a
//        full array, we need to resize the array. We cannot only resize, because this results in
//        queue elements not appearing contiguously. For example, if the array is (e,b,c,d),
//        with e being the tail and b the head, if we resize to get (e,b,c,d, J), we cannot
//        enqueue without overwriting or moving elements.