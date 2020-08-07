//5.8 REVERSE DIGITS
//        Write a program which takes an integer and returns the integer corresponding to the
//        digits of the input written in reverse order. For example, the reverse of 42 is 24, and
//        the reverse of -314 is -413.
//        Hint: How would you solve the same problem if the input is presented as a string?
public class ReverseDigits {
    public int reverseDigits(int num){
        int res = 0;
        int numRemaining = Math.abs(num);
        while( numRemaining != 0 ) {
           res = (res *10) + (numRemaining % 10);
           numRemaining /= 10;
        }
        return num < 0 ? -res : res;
    }
}
