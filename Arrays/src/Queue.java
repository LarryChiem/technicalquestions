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
    private int head = 0, tail = 0, numQueueElements = 0;
    private static final int SCALE_FACTOR = 2;
    private Integer[] entries;

    public Queue(int capacity) { entries = new Integer[capacity]; }

    public void Enqueue(Integer x) {
        if (numQueueElements == entries.length) { //NEED TO RESIZE
            //Make the Queue elements appear consecutively
            Collections.rotate(Arrays.asList(entries), -head);
            // Resets head and tail
            head = 0;
            tail = numQueueElements;
            entries = Arrays.copyOf(entries, numQueueElements * SCALE_FACTOR);
        }

        entries[tail] = x;
        tail = (tail + 1) % entries.length;
        ++numQueueElements;
    }
//    The time complexity of dequeue is 0(1), and the amortized time complexity of en¬
//    queue is 0(1).
    public Integer dequeue() {
        if (numQueueElements != 0) {
            --numQueueElements;
            Integer ret = entries[head];
            head = (head + 1) % entries.length;
            return ret;
        }
        throw new NoSuchElementException("Dequeue called on an empty queue");
    }

    public int Size() {
        return numQueueElements;
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