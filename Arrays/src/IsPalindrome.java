//7.5 For the purpose of this problem, define a palindromic string to be a string which
//        when all the nonalphanumeric are removed it reads the same front to back ignoring
//        case. For example, "A man, a plan, a canal, Panama." and "Able was I, ere I saw
//        Elba!" are palindromic, but "Ray a Ray" is not.
//        Implement a function which takes as input a string s and returns true if s is a palin¬
//        dromic string.
//        Hint: Use two indices.
public class IsPalindrome {
    public static boolean isPalindrome (String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j) {
            //i and j both skip non-alphanumeric characters
            while(!Character.isLetterOrDigit(s.charAt(i)) && i < j) {
                i++;
            }
            while(!Character.isLetterOrDigit(s.charAt(j)) && i < j) {
                j--;
            }

            if(Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) {
                return false;
            }
        }
        return true;
    }
}
//Solution: The naive approach is to create a reversed version of s, and compare it with
//        s, skipping nonalphanumeric characters. This requires additional space proportional
//        to the length of s.
//        Wedo not need to create the reverse—rather, wecan get the effect of the reverse of s
//        by traversing s from right to left. Specifically,we use twoindices to traverse the string,
//        one forwards, the other backwards, skipping nonalphanumeric characters, perform¬
//        ing case-insensitive comparison on the alphanumeric characters. We return false as
//        soon as there is a mismatch. If the indices cross, we have verified palindromicity.
//We spend 0(1) per character, so the time complexity is 0(ri), where n is the length of
//        s.