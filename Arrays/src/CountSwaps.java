public class CountSwaps {

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    // Complete the countSwaps function below.
    public static int countSwaps(int[] a) {
        int numSwaps = 0;
        boolean isSorted = false;
        int lastUnsorted = a.length - 1;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (a[i] > a[i+1]) {
                    swap(a, i, i+1);
                    numSwaps++;
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);
        return numSwaps;
    }
}
