import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraysAndStringsTest {

    @org.junit.jupiter.api.Test
    void getStr() {
    }

    @org.junit.jupiter.api.Test
    void isUniqueHashSetReturnsTrue() {
        ArraysAndStrings arraysAndStrings = new ArraysAndStrings();
        boolean actual = arraysAndStrings.isUniqueHashSet("abc");
        assertEquals(true, actual);
    }

    @org.junit.jupiter.api.Test
    void isUniqueHashSetReturnsFalse() {
        ArraysAndStrings arraysAndStrings = new ArraysAndStrings();
        boolean actual = arraysAndStrings.isUniqueHashSet("abcc");
        assertEquals(false, actual);
    }


    @org.junit.jupiter.api.Test
    void isUniqueNoDataStructuresReturnsTrue() {
        ArraysAndStrings arraysAndStrings = new ArraysAndStrings();
        boolean actual = arraysAndStrings.isUniqueNoDataStructures("zxywdkjoa");
        assertEquals(true, actual);
    }

    @org.junit.jupiter.api.Test
    void isUniqueNoDataStructuresReturnsFalse() {
        ArraysAndStrings arraysAndStrings = new ArraysAndStrings();
        boolean actual = arraysAndStrings.isUniqueNoDataStructures("cdetyabc");
        assertEquals(false, actual);
    }


    @org.junit.jupiter.api.Test
    void smallestSubarrayReturns1() {
        ArraysAndStrings arraysAndStrings = new ArraysAndStrings();
        int actual = arraysAndStrings.smallestSubarray(8, new int[]{4,2,2,7,8,1,2,8,10});
        assertEquals(1, actual);
    }
}