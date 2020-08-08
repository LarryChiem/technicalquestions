import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//6.16 THE SUDOKU CHECKER PROBLEM
//        Sudoku is a popular logic-based combinatorial number placement puzzle. The objec¬
//        tive is to fill a 9X9 grid with digitssubject to the constraint that each column, each row,
//        and each of the nine 3x3sub-grids that compose the grid contains unique integers
//        in [1, 9]. The grid is initialized with a partial assignment as shown in Figure 6.2(a) on
//        the following page; a complete solution is shown in Figure 6.2(b) on the next page.
//        Check whether a 9 X 9 2D array representing a partially completed Sudoku is valid.
//        Specifically, check that no row, column, or 3 X 3 2D subarray contains duplicates. A
//        0-value in the 2D array indicates that entry is blank; every other entry is in [1,9].
//        Hint: Directly test the constraints. Use an array to encode sets.
public class partialSudoku {
    // Check if a partially filled matrix has any conflicts.
    public static boolean isValidSudoku(List<List<Integer> partialAssignment){
// Check row constraints.
        for (int i = 0; i < partialAssignment.size(); ++i) {
            if (hasDuplicate(partialAssignment , i, i + 1, 0, partialAssignment.size())){
                return false;
            }
        }
// Check column constraints.
        for (int j = 0; j < partialAssignment.size(); ++j) {
            if (hasDuplicate(partialAssignment , 0, partialAssignment.size(), j, j + 1) {
                return false;
            }
        }
        // Check region constraints.
        int regionSize = (int)Math.sqrt(partialAssignment.size());
        for (int I = 0 ; I < regionSize; ++I) {
            for (int J = 0; J < regionSize; ++J) {
                if (hasDuplicate(partialAssignment , regionSize * I,
                        regionSize * (I + 1), regionSize * J,
                        regionSize * (J + 1))) {
                    return false;
                }
            }
        }

        // Return true if subarray partialAssignment[startRow : endRow - 1][startCol :
// endCol - 1] contains any duplicates in {1, 2, ...»
// partialAssignment.size()}; otherwise return false.
    }

    private static boolean hasDuplicate (List<List<Integer> partialAssignment, int startRow, int endRow, int startCol, int endCol ) {
        List <Boolean> isPresent = new ArrayList<>(Collections.nCopies(partialAssignment.size() + 1, false));
        for (int i = startRow; i < endRow; ++i) {
            for (int j = startCol; j < endCol; ++j) {
                if (partialAssignment.get(i).get(j) != 0 && isPresent.get(partialAssignment.get(i).get(j)) ) {
                    return true;
                }
                isPresent.set(partialAssignment.get(i).get(j), true);
            }
        }
        return false;
        return true ;
    }
}