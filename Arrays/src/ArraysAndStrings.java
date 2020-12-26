import java.util.Arrays;
import java.util.HashSet;

public class ArraysAndStrings {
    public String str;

    public ArraysAndStrings(String str) {
        this.str = str;
    }

    public ArraysAndStrings() {

    }

    public String getStr() {
        return str;
    }

    /* 1.1 isUnique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use
    additional data structures?*/
    // This HashSet method takes O(1) time and O(n) space
    public boolean isUniqueHashSet(String str) {
        HashSet<Character> characterHashSet = new HashSet<Character>();
        char[] charArray = str.toCharArray();
        /*for (int i = 0; i<str.length(); i++) {
            if(!characterHashSet.add(charArray[i]))
                return false;
        }*/
        for (char c : charArray) {
            if(!characterHashSet.add(c))
                return false;
        }
        return true;
    }

    public boolean isUniqueNoDataStructures(String str) {
        //By sorting first (O(n log(n)), we have reduced the time to O(n log(n)) and O(n) space
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        str = new String(charArray);

        //Without sorting it, this will take O(n^2) time and O(1) space.
        for (int i = 0; i < str.length()-1; i++) {
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    //CTCI solution: Time complexity is O(n), space O(1)
    public boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    //for isUnique, we can reduce our space usage by a factor of 8 by using a bit vector. We will assume,
    // in the below code, that the string only uses the lowercase letters a through z. This will allow us to use just a
    // a single int.
    boolean isUniqueCharsReduced(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }

    /* IsUnique: If we can't use additiona data structures, we can do the following:
        1. Compare every character of the string to every other character of the string. This will take O(n^2) time
        and O(1) space.

        2. If we are allowed to modify the input string, we could sort the string in O(n log(n)) time and then linearly
        check the string for neighboring characters that are identical. Careful, thoughL many sorting algorithms take
        up extra space.

        These solutions are not as optimal in some respects, but might be better depending on the constraints of the
        problem.*/

    // Return the size of the smallest subarray sum that is greater or equal to the target sum.
    public int smallestSubarray(int targetSum, int[] arr) {
        int minWindowSize = Integer.MAX_VALUE;
        int currentWindowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currentWindowSum += arr[windowEnd];

            while(currentWindowSum >= targetSum) {
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
                currentWindowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minWindowSize;
    }

    public static void main(String[] args) {
        ArraysAndStrings arraysAndStrings = new ArraysAndStrings("abc");
        boolean result = arraysAndStrings.isUniqueHashSet(arraysAndStrings.getStr());
        System.out.println(result);
    }
}