import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class findPairsWithGivenDifference {
    public static int[][] findPairs(int[] arr, int k) {
        // your code goes here
        if (k == 0 ) {
            return null;
        }
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int x : arr) {
            //x - y = k
            //x - k = y
            int y = x - k;
            hash.put(y, x);
        }

        List<int[]> pairs = new ArrayList<>();
        //Note: the order of the pairs in the output array should maintain the order of the y element in the original array.
        // [[x,y],[x2,y2],...]
        for(int y : arr) {
            if (hash.containsKey(y)) {
                // y = x - k
                // we want [x, y] format so...
                // x = y + k
                pairs.add(new int[] {y + k, y});
            }
        }
        return pairs.toArray(new int[pairs.size()][2]);
    }

    public static void main(String[] args) {
//        int[][] answers = new findPairsWithGivenDifference(new int[]{0, -1, -2, 2, 1}, 1);
//        for(int[] pair : answers) {
//            System.out.println(Arrays.toString(pair));
//        }
    }
}
