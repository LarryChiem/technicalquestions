import static org.junit.Assert.*;

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
}