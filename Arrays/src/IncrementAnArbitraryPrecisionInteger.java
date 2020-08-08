import java.util.List;

//6.2 INCREMENT AN ARBITRARY-PRECISION INTEGER
//        Write a program which takes as input an array of digits encoding a decimal number
//        D and updates the array to represent the number D + 1. For example, if the input
//        is (1,2,9) then you should update the array to (1,3,0). Your algorithm should work
//        even if it is implemented in a language that has finite-precision arithmetic.
//        Hint: Experiment with concrete examples.
public class IncrementAnArbitraryPrecisionInteger {
    public static List<Integer> plusOne (List<Integer> A) {
        int n = A.size() - 1;
        A.set(n, A.get(n) + 1);
        for (int i = n; i > 0 && A.get(i) == 10; --i) {
            A.set(i, 0);
            A.set(i - 1, A.get(i - 1) + 1);
        }
        if (A.get(0) == 10) {
// Need additional digit as the most significant digit ( i.e A. get (9))
// has a carry-out .
            A.set(0, 0);
            A.add(0, 1);
        }
        return A;
    }
}
