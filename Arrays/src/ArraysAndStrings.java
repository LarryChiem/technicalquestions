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
        for (int i = 0; i<str.length(); i++) {
            if(!characterHashSet.add(charArray[i]))
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

    public static void main(String[] args) {
        ArraysAndStrings arraysAndStrings = new ArraysAndStrings("abc");
        boolean result = arraysAndStrings.isUniqueHashSet(arraysAndStrings.getStr());
        System.out.println(result);
    }
}