import java.util.HashMap;
public class UniqueNumberOfOccurences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> intCounter = new HashMap<>();
        //We know that as long as the value of the
        for (int i = 0; i < arr.length; i++) {
            intCounter.put(arr[i], intCounter.getOrDefault(arr[i], 0) + 1);
        }
        int[] occurrencesCounter = new int[arr.length+1];
        for (int occurrences : intCounter.values()) {
            if(occurrencesCounter[occurrences]++ != 0)
                return false;
        }
        return true;
    }
}
