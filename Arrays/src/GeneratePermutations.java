import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratePermutations {
    /* 16.3 GENERATE PERMUTATIONS
This problem is concerned with computing all permutations of an array. For example,
if the array is(2,3,5, 7} one output could be (2,3,5, 7), (2,3,7,5), (2,5,3, 7), (2,5, 7,3),
<2,7,3,5>, <2,7,5,3>, <3,2,5,7>, <3,2,7,5>, <3,5,2,7>, <3,5,7,2>, <3,7,2,5>, <3,7,5,2>,
<5, 2,3, 7>, (5,2,7,3}, <5,3,2,7>, <5,3,7,2>, <5,7,2,3>, <5,7,2,3>, <7,2,3,5>, <7,2,5,3>,
<7,3, 2,5), <7,3,5, 2), <7,5, 2,3), <7,5,3, 2). (Any other ordering is acceptable too.)
Write a program which takes as input an array of distinct integers and generates all
permutations of that array. No permutation of the array may appear more than once.
Hint: How many possible values are there for the first element?*/
    public static List<List<Integer>> permutations(List<Integer> A) {
        List<List<Integer>> result = new ArrayList<>();
        directedPermutations(0 , A, result);
        return result;
    }
    private static void directedPermutations(int i, List<Integer> A,
                                             List<List<Integer>> result) {
        if (i == A.size() - 1) {
            result.add(new ArrayList<>(A));
            return ;
        }
        // Try every possibility for A[i].
        for (int j = i; j < A.size(); ++j) {
            Collections.swap(A , i, j);
            // Generate all permutations for A.subList(i + 1, A.sizeO).
            directedPermutations(i + 1, A, result);
            Collections.swap(A , i, j);
        }
    }
    /* The time complexity isdetermined by thenumber of recursive calls,since withineach
function the time spent is0(1), not including the time in the subcalls. The number
of function calls, C(n) satisfies the recurrence C(n) = 1 + nC(n - 1) for n > 1, with
C(0) = 1.
Expanding this, we see C(n) = 1 + n+ n(n - 1) + n(n - 1)(« - 2) H
----
+ n! = n!(1/n! + 1/(n -1)! + 1 /(n - 2)! H
----- 1- 1/1!). The sum (1 + 1/1! + 1/2! + ... + 1/n!) tends
to Euler's number e,so C(n) tends to (e -l)n!, i.e., 0(n!). The time complexity T(n) is
0(n X n!), since we do 0(n) computation per call outside of the recursive calls.*/
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(5);
        List<List<Integer>> actual = permutations(list);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(7, 3, 5));
        expected.add(Arrays.asList(7, 5, 3));
        expected.add(Arrays.asList(4, 7, 5));
        expected.add(Arrays.asList(3, 5, 7));
        expected.add(Arrays.asList(5, 3, 7));
        expected.add(Arrays.asList(5, 7, 3));
        assertEquals(expected, actual);
    }
}
