import java.util.HashSet;

public class ArraysAndStrings {
    public String str;

    public ArraysAndStrings(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    /* 1.1 isUnique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use
    additional data structures?*/
    public boolean isUnique(String str) {
        HashSet<Character> characterHashSet = new HashSet<Character>();
        char[] charArray = str.toCharArray();
        for (int i = 0; i<str.length(); i++) {
            if(!characterHashSet.add(charArray[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArraysAndStrings arraysAndStrings = new ArraysAndStrings("abc");
        boolean result = arraysAndStrings.isUnique(arraysAndStrings.getStr());
        System.out.println(result);
    }
}