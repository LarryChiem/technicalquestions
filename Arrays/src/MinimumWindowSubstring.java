import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        Map<Character, Integer> requiredCharacters = buildMappingOfCharactersToOccurences(t);
        Map<Character, Integer> windowCharacterMapping = new HashMap<Character, Integer>();

        int left = 0, right = 0;

        int totalCharFrequenciesToMatch = requiredCharacters.size();
        int charFrequenciesInWindowThatMatch = 0;

        int minWindowLengthSeenSoFar = Integer.MAX_VALUE;
        String minWindow = "";

        while (right < s.length()) {
            char characterAtRightPointer = s.charAt(right);
            addCharacterToHashtableMapping(windowCharacterMapping, characterAtRightPointer);

            boolean rightCharIsARequirement = requiredCharacters.containsKey(characterAtRightPointer);

            if (rightCharIsARequirement) {
                boolean requirementForCharacterMet = requiredCharacters.get(characterAtRightPointer).intValue() == windowCharacterMapping.get(characterAtRightPointer).intValue(); // This checks if the amount of required characters matches the amount of characters currently in the windowCharacterMapping

                if (requirementForCharacterMet) { // the rightPointer char has met the required characters
                    charFrequenciesInWindowThatMatch++;
                }
            }


            while (charFrequenciesInWindowThatMatch == totalCharFrequenciesToMatch && left <= right) {
                char characterAtLeftPointer = s.charAt(left);
                int windowSize = right - left + 1;

                if (windowSize < minWindowLengthSeenSoFar) {
                    minWindowLengthSeenSoFar = windowSize;
                    minWindow = s.substring(left, right+ 1);
                }

                windowCharacterMapping.put(characterAtLeftPointer, windowCharacterMapping.get(characterAtLeftPointer) - 1);

                boolean leftCharIsARequirement = requiredCharacters.containsKey(characterAtLeftPointer);

                if (leftCharIsARequirement) {
                    boolean characterFailsRequirement = windowCharacterMapping.get(characterAtLeftPointer).intValue() < requiredCharacters.get(characterAtLeftPointer).intValue();

                    if (characterFailsRequirement) {
                        charFrequenciesInWindowThatMatch--;
                    }
                }

                left++;
            }

            right++;
        }
        return minWindow;
    }

    private Map<Character, Integer> buildMappingOfCharactersToOccurences(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }

        return map;
    }

    private void addCharacterToHashtableMapping(Map<Character, Integer> map, Character c) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

}
