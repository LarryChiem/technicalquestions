import java.util.Hashtable;

//Given two almost identical lists of prisoner IDs x and y where one of the lists contains an additional ID, write a function solution(x, y) that compares the lists and returns the additional ID.
//
//        For example, given the lists x = [13, 5, 6, 2, 5] and y = [5, 2, 5, 13], the function solution(x, y) would return 6 because the list x contains the integer 6 and the list y doesn't. Given the lists x = [14, 27, 1, 4, 2, 50, 3, 1] and y = [2, 4, -4, 3, 1, 1, 14, 27, 50], the function solution(x, y) would return -4 because the list y contains the integer -4 and the list x doesn't.
//
//        In each test case, the lists x and y will always contain n non-unique integers where n is at least 1 but never more than 99, and one of the lists will contain an additional unique integer which should be returned by the function.  The same n non-unique integers will be present on both lists, but they might appear in a different order, like in the examples above. Commander Lambda likes to keep her numbers short, so every prisoner ID will be between -1000 and 1000.
//
//        Languages
//        =========
//
//        To provide a Python solution, edit solution.py
//        To provide a Java solution, edit Solution.java
//
//        Test cases
//        ==========
//        Your code should pass the following test cases.
//        Note that it may also be run against hidden test cases not shown here.
//
//        -- Java cases --
//        Input:
//        Solution.solution({13, 5, 6, 2, 5}, {5, 2, 5, 13})
//        Output:
//        6
//
//        Input:
//        Solution.solution({14, 27, 1, 4, 2, 50, 3, 1}, {2, 4, -4, 3, 1, 1, 14, 27, 50})
//        Output:
//        -4
public class TwoListsOneWithDifferentId {
    public static int solution(int[] x, int[] y) {
        // Your code here
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();

        if (x.length > y.length) {
            for (int yI = 0; yI < y.length; yI++) {
                hashtable.put(y[yI], hashtable.getOrDefault(y[yI], 0) + 1);
            }
            for (int xI = 0; xI < x.length; xI++) {
                if (hashtable.containsKey(x[xI])) {
                    hashtable.put(x[xI], hashtable.get(x[xI]) - 1);
                    if (hashtable.get(x[xI]) == 0) {
                        hashtable.remove(x[xI]);
                    }
                } else return x[xI];
            }
        } else {
            return solution(y, x);
        }
        return Integer.MIN_VALUE;
    }
}
