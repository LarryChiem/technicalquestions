import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheNearestRepeatedEntriesInAnArray {
    /* 13.6 FIND THE NEAREST REPEATED ENTRIES IN AN ARRAY
People do not like reading text in which a word is used multiple times in a short
paragraph. You are to write a program which helpsidentify such a problem.
Write a program which takes as input an array and finds the distance between a
closest pair of equal entries. For example, if s = ("All", "work", "and", "no", "play",
"makes", "for", "no", "work", "no", "fun", "and", "no", "results"), then the second
and third occurrences of "no" is the closest pair.
Hint: Each entry in the array is a candidate. */

    /* The time complexity is0(n),since we perform a constant amount of work per entry.
The space complexity is 0(d),where d is the number of distinct entries in the array. */
    public static int findNearestRepetition(List<String> paragraph) {
        Map<String, Integer> stringIndiceMap = new HashMap<>();
        int closestDistance = Integer.MAX_VALUE;
        for (int i = 0; i < paragraph.size(); i++) {
             if (stringIndiceMap.containsKey(paragraph.get(i))) {
                 closestDistance = Math.min(i - stringIndiceMap.get(paragraph.get(i)), closestDistance);
             }
             stringIndiceMap.put(paragraph.get(i), i);
        }
        return closestDistance;
    }
}
