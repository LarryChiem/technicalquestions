import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class SortAlmostSorted {
    public static void sortApproximatelySortedData(Iterator<Integer> sequence, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // Adds the first k elements into minHeap. Stop if there are fewer than k elements
        for (int i = 0; i < k && sequence.hasNext(); ++i) {
            minHeap.add(sequence.next());
        }

        // For every new element, add it to minHeap and extract the smallest one
        while (sequence.hasNext()) {
            minHeap.add(sequence.next());
            Integer smallest = minHeap.remove();
            System.out.println(smallest);
        }

        // For every new element, add it to minHeap and extract the smallest one
        while (sequence.hasNext()) {
            minHeap.add(sequence.next());
            Integer smallest = minHeap.remove();
            System.out.println(smallest);
        }

        // Sequence is exhausted, iteratively extract the remaining elements
        while (!minHeap.isEmpty()) {
            Integer smallest = minHeap.remove();
            System.out.println(smallest);
        }
    }

    public static void main(String[] args) {
        int[] sequence = new int[]{3,-1,2,6,4,5,8};
        sortApproximatelySortedData(Arrays.stream(sequence).iterator(), 2);
    }
}
