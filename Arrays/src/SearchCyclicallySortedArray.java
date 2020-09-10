import java.util.List;

public class SearchCyclicallySortedArray {
    /* 12.3 SEARCH A CYCLICALLY SORTED ARRAY
An array issaid to be cyclically sorted if it is possible to cyclically shift its entries so
that it becomes sorted. For example, the array in Figure 12.2 on the facing page is
cyclically sorted—a cyclic left shift by 4 leads to a sorted array.
Design an £?(log n) algorithm for finding the position of the smallest element in a
cyclically sorted array. Assume all elements are distinct. For example, for the array
in Figure 12.2 on the next page, your algorithm should return 4.
Hint: Use the divide and conquer principle. */
    public static int searchSmallest(List<Integer> A) {
        int left = 0, right = A.size() - 1;
        while (left < right) {
            int mid = left + ((right - left) / 2);
            if (A.get(mid) > A.get(right)) { // smallest is in A.sublist(mid + 1, right + 1)
                left = mid + 1;
            } else { //(A.get(mid) < A.get(right)) { // smallest is in A.sublist(left, mid)
               right = mid;
            }
        }
        return left;
    }
}
