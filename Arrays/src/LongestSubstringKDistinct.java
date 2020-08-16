import java.util.HashMap;

//        int actual = longestSubstringKDistinct.findLength("AAAHHIBC", 2);
/* Find the max substring length with k distinct characters.
 * Example input:
 * "AAAHHIBC" with a k distinct characters of 2 will return 5 because AAAHH is the max substring length.
 */
public class LongestSubstringKDistinct {
    public int findLength(String str, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0, windowStart = 0;
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            while ( map.size() > k) {
                char leftChar = str.charAt(windowStart);
                map.put(leftChar, map.get(leftChar) - 1);
                if(map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength;
    }
}
