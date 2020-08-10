//7.6 REVERSE ALL THE WORDS IN A SENTENCE
//        Given a string containing a set of words separated by whitespace, we would like to
//        transform it to a string in which the words appear in the reverse order. For example,
//        "Alice likes Bob" transforms to "Bob likes Alice". We do not need to keep the original
//        string.
//        Implement a function for reversing the words in a string s.
//        Hint: It's difficult to solve this with one pass.

//Solution: The code for computing the position for each character in the final result
//        in a single pass is intricate.
//        However, for the special case where each word is a single character, the desired
//        result is simply the reverse of s.
//        For the general case, reversing s gets the words to their correct relative positions.
//        However, for words that are longer than one character, their letters appear in reverse
//        order. This situation can be corrected by reversing the individual words.
//        For example, "ram is costly" reversed yields "yltsoc si mar". We obtain the final
//result by reversing each word to obtain "costly is ram".
public class ReverseAllWordsInASentence {
    public static void reverseWords(char[] input) {
        //Reverses the whole string first
        reverse(input, 0, input.length);

        int start = 0, end;
        while ((end = find(input, ' ', start)) != -1) {
            // Reverses each word in the string.
            reverse (input , start, end);
            start = end + 1;
        }

        reverse(input, start, input.length);
    }

    public static int find(char[] input, char c, int start) {
        for(int i = 0; i < input.length; i++) {
            if(input[i] == c) {
                return i;
            }
        }
        return -1;
    }

    public static void reverse(char[] input, int start, int stopIndex) {
        if (start >= stopIndex) {
            return;
        }
        while(start < stopIndex) {
            char temp = input[start];
            input[start] = input[stopIndex - 1];
            input[stopIndex - 1] = temp;
        }
    }
}
//    Since we spend 0(1) per character, the time complexity is 0(n),where n is the length
//        of s. If strings are mutable, we can perform the computation in place, i.e., the
//        additional space complexity is 0(1). If the string cannot be changed, the additional
//        space complexity is0(n),since we need to create a new string of length n.